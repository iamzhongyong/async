package asynce;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadFeture {
	//线程池
	private static ExecutorService executor = new ThreadPoolExecutor(
			10, 
			15,
			2000, 
			TimeUnit.SECONDS,
			new ArrayBlockingQueue<Runnable>(12));
	
	public static void main(String[] args) throws Exception{
		Task task = new Task();
		/**
		 * 同步调用,直接调用方法，阻塞进行
		 */
		System.out.println(task.call());
		
		/**
		 * 异步调用，构建一个新的线程来执行任务，当前线程持有一个返回结构的引用
		 */
		Future<String> rs = executor.submit(task);
		System.out.println(rs.get());
	}
}
