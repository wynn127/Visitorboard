package com.rookie.visitorboard.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import com.rookie.visitorboard.vo.BoardVo;

@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@ContextConfiguration(locations={
		"classpath*:config/context/*.xml",
		"classpath*:config/mapper/*.xml"
})
public class BoardDaoTest {
	@Resource
	BoardDao boardDao;
	
	@Test
	public void connectionDB(){
		List<BoardVo> result = boardDao.getBoardList();
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.get(0).getBoardId());
	}
}
