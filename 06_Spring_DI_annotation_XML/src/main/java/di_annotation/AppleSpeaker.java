package di_annotation;

import org.springframework.stereotype.Component;

//@Component("appleSpeaker") 자동으로 첫글자 소문자로시작하는걸만들어준다.

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("-->> AppleSpeaker() 생성");
	}
	@Override
	public void volumUp() {
		System.out.println("-->> AppleSpeaker 소리 크게");
	}
	
	@Override
	public void volumDown() {
		System.out.println("-->> AppleSpeaker 소리 작게");
	}

}
