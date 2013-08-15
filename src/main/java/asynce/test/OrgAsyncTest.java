package asynce.test;

import org.iamzhongyong.framework.OrgAsync;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import asynce.SpringAsyncTest;

public class OrgAsyncTest {

	//基于注解的异步化处理，单元测试
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");	
		OrgAsyncTest orgAsyncTest = (OrgAsyncTest) context.getBean("orgAsyncTest");
		orgAsyncTest.testDoubleNull();
		
		String testInputNull = orgAsyncTest.testInputNull();
		System.out.println("testInputNull,"+testInputNull);
		
		orgAsyncTest.testInputNotNullVoid("bixiao");
		
		String testInput = orgAsyncTest.testInput("bixiao.zy");
		System.out.println("testInput,"+testInput);
		
	}
	//入参和返回值都是空
	@OrgAsync
	public void testDoubleNull(){
		System.out.println("入参为空，返回值为void，"+Thread.currentThread().getName());
	}
	//没入参，有返回值
	@OrgAsync
	public String testInputNull(){
		System.out.println("入参为空，返回值为String，"+Thread.currentThread().getName());
		return "iamzhongyong";
	}
	//有入参，没返回值
	@OrgAsync
	public void testInputNotNullVoid(String name){
		System.out.println("入参为空，返回值为String，"+Thread.currentThread().getName()+",input="+name);
	}
	//有入参，有返回值
	@OrgAsync
	public String testInput(String name){
		System.out.println("有入参，有返回值，"+Thread.currentThread().getName()+",name="+name);
		return "iamzhongyong"+","+name;
	}
}
