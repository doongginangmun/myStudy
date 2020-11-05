package di_annotation;

import org.springframework.stereotype.Component;

class SonySpeaker implements Speaker{
	public SonySpeaker(){
		System.out.println(">> SonySpeaker 생성");
	}
	@Override
	public void volumUp() {
		System.out.println(">> SonySpeaker - 소리를 크게");
		
	}
	@Override
	public void volumDown() {
		System.out.println(">> SonySpeaker - 소리를 작게");
		
	}
	
}
