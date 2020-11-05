package polymorphism01;

public class SamsungTV implements TV{
	
		public SamsungTV() {
			System.out.println(">> SamsungTV 객체 생성");
		}
	@Override
	public void PowerOn() {
		System.out.println("samsungTV -전원ON");
	}
	@Override
	public void PowerOff() {
		System.out.println("samsungTV -전원Off");
	}
	@Override
	public void SoundUp() {
		System.out.println("samsungTV -소리크게");
	}
	@Override
	public void SoundDown() {
		System.out.println("samsungTV -소리작게");
	}
	
}
