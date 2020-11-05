package com.spring.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.board.BoardService;
import com.spring.biz.board.BoardVO;

@Service("boardService") //@Service @컴포넌트 상속확장 어노테이션
// 비지니스 로직처리 서비스 영역에 사용
public class BoardServiceImpl implements BoardService {
	@Autowired //타입이 일치하는 객체(인스턴스) 주입(DI)
	private BoardDAO boardDAO; 
	public BoardServiceImpl() {
		System.out.println(">>boardServiceImpl 객체 생성");
	}
	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}

	

}
