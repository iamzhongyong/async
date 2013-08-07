package asynce;

import org.iamzhongyong.framework.OrgAsync;
import org.springframework.stereotype.Component;

@Component("taskOrgAsync")
public class TaskOrgAsync {

	@OrgAsync
	public void testOrgAsync(){
		System.out.println("�����ĺ�����ִ��");
		System.out.println(Thread.currentThread().getName());
	}
	@OrgAsync
	public String testOrgAsyncReturn(){
		System.out.println("�з���ֵ�ķ�����ִ��");
		return "iamzhongyong";
	}
	@OrgAsync
	public String testReturnAndArgs(String input){
		System.out.println("��Σ�"+input);
		return input+",iamzhongyong";
	}
}
