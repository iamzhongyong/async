package org.iamzhongyong.framework;

import org.springframework.stereotype.Component;

@Component("taskOrgAsync")
public class TaskOrgAsync {

	@OrgAsync
	public void testOrgAsync(){
		System.out.println("�����ĺ�����ִ��");
		System.out.println(Thread.currentThread().getName());
	}
}
