package com.hello.bbs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.bbs.dao.BoardDao;
import com.hello.bbs.vo.BoardVO;

@Repository
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao {
	
	private static final String NAME_SPACE="com.hello.bbs.dao.impl.BoardDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }
    
    @Override
    public int selectBoardAllCount() {
    	return this.getSqlSession().selectOne(NAME_SPACE +"selectBoardAllCount");
    }
    
    @Override
    public List<BoardVO> selectBoardAll(){
    	return this.getSqlSession().selectList(NAME_SPACE + "selectBoardAll");
    }


}