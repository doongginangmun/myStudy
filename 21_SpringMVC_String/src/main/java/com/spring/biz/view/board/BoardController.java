package com.spring.biz.view.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;
@Controller
public class BoardController {

		@RequestMapping("/getBoard.do")
		public String getBoard(BoardVO vo,BoardDAO boardDAO, Model model) {
			System.out.println(">>> 게시글 상세보기");
			BoardVO board = boardDAO.getBoard(vo);
			//mav.addObject("board", boardDAO.getBoard(vo));
			//mav.setViewName("getBoard.jsp");
			model.addAttribute("board",board);
			return "getBoard.jsp";
		}
		@RequestMapping("/getBoardList.do")
		public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
			System.out.println(">>> 게시글 전체 목록 보여주기 - getBoardList()");
			List<BoardVO> list = boardDAO.getBoardList(vo);
			model.addAttribute("boardList", list);
			
			return "getBoardList.jsp";
		}
		@RequestMapping("/insertBoard.do")
		public String InsertBoard(BoardVO vo,BoardDAO boardDAO) {
			System.out.println(">>> 게시글 입력 처리");
			boardDAO.insertBoard(vo);
			return "redirect:getBoardList.do";
		}
		
		@RequestMapping("/updateBoard.do")
		public String updateBoard(BoardVO vo,BoardDAO boardDAO) {
			System.out.println(">>> 게시글 수정 처리");
			boardDAO.updateBoard(vo);
			return "redirect:getBoardList.do";
		}

}
