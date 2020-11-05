package polymorphism01;

class SamsungTV implements TV {
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println(">> SamsungTV2 객체 생성");
		//필드에 SonySpeacker에 객체 주입
		speaker = new SonySpeaker();
	}
	
	public void powerOn() {
		System.out.println("SamsungTV2 - 전원ON");
	}
	public void powerOff() {
		System.out.println("SamsungTV2 - 전원OFF");
	}
	public void volumnUp() {
		System.out.println("SamsungTV2 - 소리크게");
		speaker.volumnUp();
	}
	public void volumnDown() {
		System.out.println("SamsungTV2 - 소리크게");
		speaker.volumnDown();
	}
	
	//===========================
	public void initMethod() {
		System.out.println("SamsungTV2 - initMethod() 실행");
	}
	public void destroyMethod() {
		System.out.println("SamsungTV2 - destroyMethod() 실행");
	}
}







