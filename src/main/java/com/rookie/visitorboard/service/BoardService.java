package com.rookie.visitorboard.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rookie.visitorboard.dao.BoardDao;
import com.rookie.visitorboard.vo.BoardVo;

@Service
@Transactional
public class BoardService {
	@Resource
	private BoardDao boardDao;
	
	public List<BoardVo> getBoardItems(){
		return boardDao.getBoardList();
	}
}
