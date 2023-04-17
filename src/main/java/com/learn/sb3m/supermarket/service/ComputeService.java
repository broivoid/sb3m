package com.learn.sb3m.supermarket.service;

import com.learn.sb3m.supermarket.domain.model.Fruit;

import java.math.BigDecimal;
import java.util.List;

public interface ComputeService {

    BigDecimal computeTol(List<Fruit> fruits);
}
