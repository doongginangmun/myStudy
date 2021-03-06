package com.spring.biz.user;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.biz.board.BoardService;
import com.spring.biz.board.BoardVO;

public class UserServiceClient {

	public static void main(String[] args) {
		System.out.println("--- 스프링 컨테이너 구동전 -----");
		//1. 스프링 컨테이너 구동(스프링 설정 파일 읽어서)
		AbstractApplicationContext container
				=new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("--- 스프링 컨테이너 구동후 -----");
		//2. 스프링 컨테이너 사용 : 생성된 객체 요청(Lookup)
		UserService userService = (UserService) container.getBean("userService");

		//2-1 입력
		UserVO vo = new UserVO();
		vo.setId("테스트");
		System.out.println(userService.getUser(vo));
		
//		//전체 목록 조회
//		List<BoardVO> list = userService.getUserList(vo);
//		for(BoardVO board : list){
//			System.out.println(board);
//		}
		System.out.println("--- 스프링 컨테이너 종료처리 -----");
		//3. 스프링 컨테이너 종료(close)
		container.close();
		}
//	}

//	}

}
