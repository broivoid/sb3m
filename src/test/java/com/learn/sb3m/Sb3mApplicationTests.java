package com.learn.sb3m;

import com.learn.sb3m.supermarket.domain.model.Apple;
import com.learn.sb3m.supermarket.domain.model.Fruit;
import com.learn.sb3m.supermarket.domain.model.Strawberry;
import com.learn.sb3m.supermarket.domain.types.SaleTypeEnum;
import com.learn.sb3m.supermarket.service.CashContext;
import com.learn.sb3m.supermarket.service.ComputeService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = {Sb3mApplication.class})
@ComponentScan("com.learn.sb3m.supermarket.service")
@RunWith(SpringRunner.class)
public class Sb3mApplicationTests {

	private final Logger logger = LoggerFactory.getLogger(Sb3mApplicationTests.class);
	@Autowired
	private ComputeService computeService;
	@Test
	public void computeTest() {

		List<Fruit> peopleA = new ArrayList<>(20);
		Fruit apple = new Apple("Apple", new BigDecimal(8),new BigDecimal(10));
		Fruit strawberry = new Strawberry("Strawberry", new BigDecimal(13),new BigDecimal(2));
		peopleA.add(apple);
		peopleA.add(strawberry);
		BigDecimal tol = computeService.computeTol(peopleA);
		CashContext cashContext1 = new CashContext(SaleTypeEnum.RETURN.getCode());
		BigDecimal result = cashContext1.getResult(tol);
		logger.info("总价：{}", result);
	}

}
