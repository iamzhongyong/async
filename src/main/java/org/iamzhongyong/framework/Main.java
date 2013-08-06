package org.iamzhongyong.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		TaskOrgAsync taskOrgAsync = (TaskOrgAsync)context.getBean("taskOrgAsync");
		taskOrgAsync.testOrgAsync();
	}

}
