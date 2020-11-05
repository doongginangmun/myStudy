package polymorphism02;

public class SamsungTV implements TV{
	
		public SamsungTV() {
			System.out.println(">> SamsungTV 객체 생성");
		}
	@Override
	public void PowerOn() {
		System.out.println("samsungTV2 -전원ON");
	}
	@Override
	public void PowerOff() {
		System.out.println("samsungTV2 -전원Off");
	}
	@Override
	public void SoundUp() {
		System.out.println("samsungTV2 -소리크게");
	}
	@Override
	public void SoundDown() {
		System.out.println("samsungTV2 -소리작게");
	}
	//======================
	public void initMethod() {
		System.out.println("SamsungTV2 - initMethod() 실행");
	}
	public void destoryMethod() {
		System.out.println("SamsungTV2 - destoryMethod() 실행");
	}
	
}
