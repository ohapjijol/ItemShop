package com.shop.item;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.shop.item.model.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemApplicationTests {

	@Autowired
	SqlSession sqlSession;

	@Before
	public void setup() {
	}

	@Test
	public void contextLoads() {
	}

}
