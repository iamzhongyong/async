package org.iamzhongyong.framework;

import org.springframework.stereotype.Component;

@Component("taskOrgAsync")
public class TaskOrgAsync {

	@OrgAsync
	public void testOrgAsync(){
		System.out.println("方法的核心在执行");
		System.out.println(Thread.currentThread().getName());
	}
}
