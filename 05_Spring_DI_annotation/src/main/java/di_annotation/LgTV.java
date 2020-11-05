package di_annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
//객체 생성을 요청하는 어노테이션
@Component
class LgTV implements TV {
	@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println(">> LgTV 객체 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV - 전원 ON");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV - 전원 OFF");
	}
	@Override
	public void volumnUp() {
		System.out.println("LgTV - 소리크게~~~~");
		speaker.volumUp();
	}
	@Override
	public void volumnDown() {
		System.out.println("LgTV - 소리작게~~~~");
		speaker.volumDown();
	}
}




