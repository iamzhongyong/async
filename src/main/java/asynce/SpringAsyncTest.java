package asynce;

import org.iamzhongyong.framework.OrgAsync;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component("springAsyncTest")
public class SpringAsyncTest {

	@Async
	public void testPrint() throws Exception{
		System.out.println("-----------------------");
		System.out.println(Thread.currentThread().getName());
		System.out.println("no return result,imahzongyong");
	}
	
	@Async
	public String testPrintString() throws Exception{
		System.out.println("-----------------------");
		System.out.println(Thread.currentThread().getName());

		//System.out.println("return result,imahzongyong");
		return "iamzhongyong";
	}
}
