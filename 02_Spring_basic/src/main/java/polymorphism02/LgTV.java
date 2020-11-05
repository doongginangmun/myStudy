package polymorphism02;

public class LgTV implements TV{
	public LgTV() {
		System.out.println(">> LgTV 객체 생성");
	}
	@Override
	public void PowerOn() {
		System.out.println("LgTV 전원on");
	}
	@Override
	public void PowerOff() {
		System.out.println("LgTV 전원off");
	}
	@Override
	public void SoundUp() {
		System.out.println("LgTV 소리크게");
	}
	@Override
	public void SoundDown() {
		System.out.println("LgTV 소리작게");
	}

}
