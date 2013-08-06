package asynce;

import org.springframework.scheduling.annotation.Async;

public class AnnoTest {
	
	@Async
	public String testPring(){
		return "iamzhongyong";
	}

}
