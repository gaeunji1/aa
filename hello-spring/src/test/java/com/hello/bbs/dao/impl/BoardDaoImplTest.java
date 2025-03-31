package com.hello.bbs.dao.impl;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.context.annotation.Import;

import com.hello.bbs.dao.BoardDao;
import com.hello.bbs.dao.impl.BoardDaoImpl;
import com.hello.bbs.vo.BoardVO;


@MybatisTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Import({BoardDaoImpl.class})
public class BoardDaoImplTest {
	
	@Autowired
	private BoardDao boardDaoImpl;
	
	
	@Test
	public void testCount() {
		int count = boardDaoImpl.selectBoardAllCount();
		int correctCount = 0;
		// 두개가 같으면 성공
		// 다르면 실패
		Assertions.assertEquals(count, correctCount);
	}
	@Test
	public void testSelect() {
		List<BoardVO> boardList = boardDaoImpl.selectBoardAll();
		int size = boardList.size();
		int correctSize = 0;
		
		Assertions.assertEquals(size, correctSize);
	}
	
}
