package asynce;

import java.util.Date;
import java.util.concurrent.Callable;

public class Task implements Callable<String> {

	public String call() throws Exception {
		System.out.println("call ing");
		return "iamzhongyong,"+new Date();
	}

}
