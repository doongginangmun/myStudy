package com.spring.biz.board;

import java.util.List;

public interface BoardService {
	//CRUD기능 구현 메서드 정의
	void insertBoard(BoardVO vo);
	void updateBoard(BoardVO vo);
	void deleteBoard(BoardVO vo);
	BoardVO getBoard(BoardVO vo);
	List<BoardVO> getBoardList(BoardVO vo);
	
}
