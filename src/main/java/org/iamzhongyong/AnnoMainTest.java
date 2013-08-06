package org.iamzhongyong;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnoMainTest {

	public static void main(String[] args)  throws Exception{
		//读取方法上的注解
		Class clazz = Class.forName("org.iamzhongyong.AnnoBizTest");
		
		AnnoBizTest test = (AnnoBizTest)clazz.newInstance();
		
		Method method = clazz.getMethod("testPrint", null);
		
		method.invoke(test, null);
		
		Annotation[] anno = method.getAnnotations();
		for(Annotation an : anno){
			if(an instanceof OrgAsync){
				System.out.println(an+",iamzhongyong");
			}else{
				System.out.println("iamzhongyong");
			}
		}
	}

}
