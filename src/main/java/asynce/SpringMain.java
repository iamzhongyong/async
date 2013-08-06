package asynce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		
		SpringAsyncTest springAsyncTest = (SpringAsyncTest) context.getBean("springAsyncTest");
		
		//System.out.println(Thread.currentThread().getName());
		//springAsyncTest.testPrint();
		
		String rs =springAsyncTest.testPrintString();
		System.out.println(rs);
	}

}
