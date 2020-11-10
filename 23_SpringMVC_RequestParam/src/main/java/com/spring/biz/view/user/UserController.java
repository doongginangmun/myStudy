package com.spring.biz.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.biz.user.UserVO;
import com.spring.biz.user.impl.UserDAO;

@Controller
public class UserController {

	/* @RequestMapping : 요청과 처리(Controller) 연결(HandlerMapping 역할 대체)
	command 객체 사용 : 파라미터로 전달되는 값을 Command 객체에 설정
	스프링프레임워크에서 객체 생성하고 파라미터 값을 설정해서 전달해줌
	1. UserVO 타입의 객체 생성
	2. UserVO 타입의 객체에 전달받은 파라미터 값을 설정(이름 일치하는 경우)
	3. UserVO 타입의 객체를 메소드의 파라미터 값으로 전달
	*/
	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO) {
		System.out.println(">> 로그인 처리 - POST");
		System.out.println("vo : " + vo);
		System.out.println("userDAO : " + userDAO);
		
		UserVO user = userDAO.getUser(vo);
		if (user != null) {
			System.out.println("> 로그인 성공!!");
			return "redirect:getBoardList.do";
		} else {
			System.out.println("> 로그인 실패~~~");
			return "login.jsp";
		}
	}
	
	@RequestMapping(value="/login.do", method = RequestMethod.GET)
	public String loginView() {
		System.out.println(">>> 로그인 처리 - login 뷰로 이동");
		return "login.jsp";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		//1. 세션 초기화
		session.invalidate();
		
		return "login.jsp";
	}	
}
