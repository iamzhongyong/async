package asynce.test;

import org.iamzhongyong.framework.OrgAsync;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import asynce.SpringAsyncTest;

public class OrgAsyncTest {

	//����ע����첽��������Ԫ����
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
	//��κͷ���ֵ���ǿ�
	@OrgAsync
	public void testDoubleNull(){
		System.out.println("���Ϊ�գ�����ֵΪvoid��"+Thread.currentThread().getName());
	}
	//û��Σ��з���ֵ
	@OrgAsync
	public String testInputNull(){
		System.out.println("���Ϊ�գ�����ֵΪString��"+Thread.currentThread().getName());
		return "iamzhongyong";
	}
	//����Σ�û����ֵ
	@OrgAsync
	public void testInputNotNullVoid(String name){
		System.out.println("���Ϊ�գ�����ֵΪString��"+Thread.currentThread().getName()+",input="+name);
	}
	//����Σ��з���ֵ
	@OrgAsync
	public String testInput(String name){
		System.out.println("����Σ��з���ֵ��"+Thread.currentThread().getName()+",name="+name);
		return "iamzhongyong"+","+name;
	}
}
