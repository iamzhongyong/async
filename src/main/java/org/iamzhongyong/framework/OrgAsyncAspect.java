package org.iamzhongyong.framework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * �첽��ִ�к���@OrgAsyncע��ķ���
 * @author bixiao.zy
 *
 */
@Aspect
public class OrgAsyncAspect {
	//�̳߳�
	private static ExecutorService executor = new ThreadPoolExecutor(
				10, 
				15,
				2000, 
				TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(12));
	@Around("execution(* *..*.*(..)) && @annotation(orgAsync)")
	public Object asyncExecutor(final ProceedingJoinPoint joinPoint, final OrgAsync orgAsync) throws Throwable {
		System.out.println("��ʼִ�з���������ע��ķ���������");
		
		executor.submit(new Callable<Object>() {
			public Object call() throws Exception {
				try{
					Object result = joinPoint.proceed();
					if(result instanceof Future){
						return ((Future<?>) result).get();
					}
				}catch(Exception e){
					//
				} catch (Throwable e) {
					// 
				}
				return null;
			}
			
		});
		joinPoint.proceed();
		return null;
	}
}
