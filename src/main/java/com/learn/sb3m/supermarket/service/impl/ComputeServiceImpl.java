package com.learn.sb3m.supermarket.service.impl;

import com.learn.sb3m.supermarket.entity.Fruit;
import com.learn.sb3m.supermarket.service.ComputeService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Service
public class ComputeServiceImpl implements ComputeService {

    @Override
    public BigDecimal computeTol(List<Fruit> fruits){
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
}
