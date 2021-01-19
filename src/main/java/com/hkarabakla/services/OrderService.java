package com.hkarabakla.services;

import com.hkarabakla.repositories.OrderRepo;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final OrderRepo repo;

    public OrderService(OrderRepo repo) {
        this.repo = repo;
    }

    public void orderOperations(){
        System.out.println("orders is coming");
    }
}
