package com.spring.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.biz.common.JDBCUtil;
import com.spring.biz.user.UserVO;

//@Repository : DB연동작업 처리하는 클래스에 설정(xxxDAO, xxxDao)
@Repository
public class UserDAO {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	//SQL문
	private final String GET_USER
	="SELECT * FROM USER1 WHERE id=?";
	
	public UserDAO() {
		System.out.println(">>UserDAO()객체 생성");
	}
	public UserVO getUser(UserVO vo) {
		System.out.println("-->JDBC로 getUser() 실행");
		UserVO userVO =null;
		conn = JDBCUtil.getConnection();
		if(conn ==null) return null;
		try {
			stmt = conn.prepareStatement(GET_USER);
			stmt.setString(1, vo.getId());
			
			rs = stmt.executeQuery();
			if(rs.next()) {
				userVO = new UserVO();
				userVO.setId(rs.getString("ID"));
				userVO.setPassword(rs.getString("PASSWORD"));
				userVO.setName(rs.getString("NAME"));
				userVO.setRole(rs.getString("ROLE"));
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, stmt, rs);
		}
		return userVO;
		
	}
}
