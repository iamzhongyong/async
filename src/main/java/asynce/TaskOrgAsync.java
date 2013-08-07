package asynce;

import org.iamzhongyong.framework.OrgAsync;
import org.springframework.stereotype.Component;

@Component("taskOrgAsync")
public class TaskOrgAsync {

	@OrgAsync
	public void testOrgAsync(){
		System.out.println("方法的核心在执行");
		System.out.println(Thread.currentThread().getName());
	}
	@OrgAsync
	public String testOrgAsyncReturn(){
		System.out.println("有返回值的方法在执行");
		return "iamzhongyong";
	}
	@OrgAsync
	public String testReturnAndArgs(String input){
		System.out.println("入参："+input);
		return input+",iamzhongyong";
	}
}
