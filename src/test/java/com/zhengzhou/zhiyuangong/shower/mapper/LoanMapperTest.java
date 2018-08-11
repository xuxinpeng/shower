package com.zhengzhou.zhiyuangong.shower.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application.xml" })
public class LoanMapperTest {

	@Autowired
	LoanMapper mapper;

	@Test
	public void test() {
		System.out.println(mapper);
		Integer count = 0;
		System.out.println("----------------");
		System.out.println(mapper.countLoan());
		System.out.println("----------------");
	}

}
