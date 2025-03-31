package com.hello.bbs.dao;

import java.util.List;

import com.hello.bbs.vo.BoardVO;

public interface BoardDao {

	public int selectBoardAllCount();
	
	public List<BoardVO> selectBoardAll();
}