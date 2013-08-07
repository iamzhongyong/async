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
 * 异步话执行含有@OrgAsync注解的方法
 * @author bixiao.zy
 *
 */
@Aspect
public class OrgAsyncAspect {
	//线程池
	private static ExecutorService executor = new ThreadPoolExecutor(
				10, 
				15,
				2000, 
				TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(12),
				new AsyncThreadFactory());

	
	@Around("@annotation(org.iamzhongyong.framework.OrgAsync)")
	public Object asyncExecutor(final ProceedingJoinPoint joinPoint) throws Throwable {
		Future<?> result = executor.submit(new Callable<Object>() {
			public Object call() throws Exception {
				Object result = null;
				try{
					result = joinPoint.proceed();
					if(result instanceof Future){
						return ((Future<?>) result).get();
					}
				}catch (Throwable e) {
					// 
				}
				return result;
			}
		});
		return result.get();
	}
}
