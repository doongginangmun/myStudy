package di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv") //tv라는 객체 생성
class SamsungTV implements TV  {
	@Autowired //동일한 데이터 타입을 주입한다.
	@Qualifier("speaker") //두 개의 값 중 내가 사용할값 지정 @Qualifier는 단독사용불가 @Autowired 와 함께 사용
	private Speaker speaker;
	private int price;
	private int width;
	private int height;
	
	public SamsungTV() {
		System.out.println(">> SamsungTV2 객체 생성");
	}
	public SamsungTV(Speaker speacker) {
		this.speaker = speacker;
		System.out.println(">> SamsungTV2(speacker) 객체 생성");
	}
	public SamsungTV(Speaker speacker, int price) {
		this.speaker = speacker;
		this.price = price;
		System.out.println(">> SamsungTV2(speacker,price) 객체 생성");
	}
	public SamsungTV(Speaker speacker, int width, int height) {
		this.speaker = speacker;
		this.width = width;
		this.height = height;
		System.out.println(">> SamsungTV2(speacker,width,height) 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV2 - 전원ON");
	}
	public void powerOff() {
		System.out.println("SamsungTV2 - 전원OFF");
	}
	public void volumnUp() {
		System.out.println("SamsungTV2 - 소리크게");
		speaker.volumUp();
	}
	public void volumnDown() {
		System.out.println("SamsungTV2 - 소리작게");
		speaker.volumDown();
	}
	//-----------------------
	@Override
	public String toString() {
		return "SamsungTV [speaker=" + speaker + ", price=" + price + ", width=" + width + ", height=" + height + "]";
	}
	
	//===========================
	public void initMethod() {
		System.out.println("SamsungTV2 - initMethod() 실행");
	}
	public void destroyMethod() {
		System.out.println("SamsungTV2 - destroyMethod() 실행");
	}
	
	//==== getters, setters 생성 ============
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
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
}







