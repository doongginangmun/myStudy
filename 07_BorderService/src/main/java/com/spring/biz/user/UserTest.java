package com.spring.biz.user;

import com.spring.biz.user.impl.UserDAO;

public class UserTest {

	public static void main(String[] args) {
		UserVO vo = new UserVO();
		vo.setId("테스트");
		
		UserDAO dao = new UserDAO();
		UserVO userVO = dao.getUser(vo);
		System.out.println("userVO :" +userVO);
	}

}
