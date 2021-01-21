package com.hkarabakla.services;

import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Orders;
import com.hkarabakla.repositories.OrderRepo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;

@Component
public class OrderService {

    private final OrderRepo repo;

    public OrderService(OrderRepo repo) {
        this.repo = repo;
    }

    public void orderOperations(){
        /*Book book = new Book();
        book.setIsbn(UUID.randomUUID().toString());
        book.setName("Spring in Action");*/

        Orders orders=new Orders();
        orders.setId(4);
        orders.setCreatedDate(LocalDate.now());
        orders.setTotal(15.0);
        //orders.setOrder_books(Collections.singletonList(book));

        repo.save(orders);
        System.out.println(orders);
        //System.out.println(repo.findAllByCreatedDateAndAndTotal(LocalDate.now(),17.0));
        //System.out.println("orders is coming");
    }
}
