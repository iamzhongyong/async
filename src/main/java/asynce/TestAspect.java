package asynce;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {
	@Before("execution(* *..*testPrintString(..))")
	public void pringDate(){
		System.out.println(new Date()+","+Thread.currentThread().getName());
	}
}
