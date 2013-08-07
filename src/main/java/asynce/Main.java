package asynce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		TaskOrgAsync taskOrgAsync = (TaskOrgAsync)context.getBean("taskOrgAsync");
		//taskOrgAsync.testOrgAsync();	
//		String str = taskOrgAsync.testOrgAsyncReturn();
//		System.out.println(str);
		
		System.out.println(taskOrgAsync.testReturnAndArgs("bixiaoo"));
		
		
		//SpringAsyncTest springAsyncTest = (SpringAsyncTest)context.getBean("springAsyncTest");
		//System.out.println(springAsyncTest.testPrintString());
	}

}
