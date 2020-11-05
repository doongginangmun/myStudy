package di_collection;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		System.out.println("--- 스프링 컨테이너 구동전 -----");
		//1. 스프링 컨테이너 구동(스프링 설정 파일 읽어서)
		AbstractApplicationContext factory
				=new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("--- 스프링 컨테이너 구동후 -----");
		//2. 스프링 컨테이너 사용 : 생성된 객체 요청(Lookup)
		CollectionBean bean = (CollectionBean) factory.getBean("CollectionBean");
		
		System.out.println("---List 타입 ----");
		System.out.println("bean : "+ bean);
		
		bean.getAddressList();
		//List<String> addressList = bean.getAddressList();
		for(String address : bean.getAddressList()) {
			System.out.println(address);
		}
		System.out.println("---Set 타입 ----");
		System.out.println("set : " + bean.getAddressSet());
		
		System.out.println("---Map 타입 ----");
		System.out.println("Map : " + bean.getAddressMap());
		
		System.out.println("---Propertries 타입 ----");
		System.out.println("props : " + bean.getAddressProp());
		
		System.out.println("--- 스프링 컨테이너 종료처리 -----");
		//3. 스프링 컨테이너 종료(close)
		factory.close();
	}

}
