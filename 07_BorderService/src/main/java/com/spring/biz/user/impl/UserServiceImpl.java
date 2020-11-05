package com.spring.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.user.UserService;
import com.spring.biz.user.UserVO;
@Service("userService") //@Service @컴포넌트 상속확장 어노테이션
//비지니스 로직처리 서비스 영역에 사용
public class UserServiceImpl implements UserService {
	@Autowired 
	private UserDAO userDAO;
	
	//생성자
	public UserServiceImpl() {
	System.out.println("==>>UserServiceImpl()실행");
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		
		return userDAO.getUser(vo);
	}

}
