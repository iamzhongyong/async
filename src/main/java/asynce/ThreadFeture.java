package asynce;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadFeture {
	//�̳߳�
	private static ExecutorService executor = new ThreadPoolExecutor(
			10, 
			15,
			2000, 
			TimeUnit.SECONDS,
			new ArrayBlockingQueue<Runnable>(12));
	
	public static void main(String[] args) throws Exception{
		Task task = new Task();
		/**
		 * ͬ������,ֱ�ӵ��÷�������������
		 */
		System.out.println(task.call());
		
		/**
		 * �첽���ã�����һ���µ��߳���ִ�����񣬵�ǰ�̳߳���һ�����ؽṹ������
		 */
		Future<String> rs = executor.submit(task);
		System.out.println(rs.get());
	}
}
