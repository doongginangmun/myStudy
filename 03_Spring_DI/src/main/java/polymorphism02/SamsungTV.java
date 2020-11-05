package polymorphism02;

class SamsungTV implements TV {
	private SonySpeaker speaker;
	private int price;
	private int width;
	private int height;
	
	public SamsungTV() {
		System.out.println(">> SamsungTV2 객체 생성");
	}
	//의존성 주입
	public SamsungTV(SonySpeaker speacker) {
		this.speaker = speacker;
		System.out.println(">> SamsungTV2(speacker) 객체 생성");
	}
	public SamsungTV(SonySpeaker speacker, int price) {
		this.speaker = speacker;
		this.price = price;
		System.out.println(">> SamsungTV2(speacker,price) 객체 생성");
	}
	public SamsungTV(SonySpeaker speacker, int width, int height) {
		this.speaker = speacker;
		this.width = width;
		this.height = height;
		System.out.println(">> SamsungTV2(speacker,width,height) 객체 생성");
	}
	
	
	//-----------------------
	@Override
	public String toString() {
		return "SamsungTV [speaker=" + speaker + ", price=" + price + ", width=" + width + ", height=" + height + "]";
	}
	
	public SonySpeaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//===========================
	public void initMethod() {
		System.out.println("SamsungTV2 - initMethod() 실행");
	}
	public void destroyMethod() {
		System.out.println("SamsungTV2 - destroyMethod() 실행");
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV - 파워 온");
		
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV2 - 전원OFF");
		
	}
	@Override
	public void volumnUp() {
		System.out.println("SamsungTV2 - 소리크게");
		speaker.volumnUp();
		
	}
	@Override
	public void volumnDown() {
		System.out.println("SamsungTV2 - 소리작게");
		speaker.volumnDown();
		
	}
	
}







