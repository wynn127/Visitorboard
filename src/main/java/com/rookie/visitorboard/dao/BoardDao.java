package com.rookie.visitorboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.rookie.visitorboard.vo.BoardVo;

public class BoardDao {
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public List<BoardVo> getBoardList() {
		return sqlSession.selectList("BoardMapper.getBoardList");
	}
}
