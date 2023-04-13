package com.learn.sb3m;

import com.learn.sb3m.supermarket.Apple;
import com.learn.sb3m.supermarket.CashContext;
import com.learn.sb3m.supermarket.Fruit;
import com.learn.sb3m.supermarket.Strawberry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController("/test")
public class Sb3mApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb3mApplication.class, args);

		List<Fruit> peopleA = new ArrayList<>(20);
		Fruit apple = new Apple("Apple", new BigDecimal(8),new BigDecimal(10));
		Fruit strawberry = new Strawberry("Strawberry", new BigDecimal(13),new BigDecimal(2));
		peopleA.add(apple);
		peopleA.add(strawberry);
		BigDecimal tol = computeTol(peopleA);
		CashContext cashContext1 = new CashContext("满100返10");
		BigDecimal result = cashContext1.getResult(tol);
		System.out.println("总价："+result);


	}

	public static BigDecimal computeTol(List<Fruit> fruits){
		BigDecimal total = new BigDecimal(BigInteger.ZERO);
		if (CollectionUtils.isEmpty(fruits)) {
			return total;
		}
		for(Fruit f : fruits) {
			if (null == f.getWeight()) {
				continue;
			}
			total = total.add(f.getPrice().multiply(f.getWeight()));
		}
		return total;
	}

	@GetMapping("/test1")
	public String test(){
		return "hello";
	}

}
