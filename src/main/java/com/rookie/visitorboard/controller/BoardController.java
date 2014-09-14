package com.rookie.visitorboard.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rookie.visitorboard.service.BoardService;
import com.rookie.visitorboard.vo.BoardVo;

@Controller
public class BoardController {
	@Resource
	private BoardService boardService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String goHome(Model model){
		List<BoardVo> boardList = boardService.getBoardItems();

		for(BoardVo boardItem : boardList){
			System.out.println("item: " + boardItem.getBoardId());
		}
		
		model.addAttribute("boardList", boardList);
		return "board";
	}
}
