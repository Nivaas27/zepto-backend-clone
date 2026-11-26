package com.spring.zepto.Service;

import com.spring.zepto.Entity.Orders;
import com.spring.zepto.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Orders> insert(List<Orders> orders) {
        return orderRepository.saveAll(orders);
    }

    public List<Orders> fetchall() {
            return orderRepository.findAll();
    }

    public Orders fetch(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Orders update(Orders orders, Integer id) {
        Orders orders1 = orderRepository.findById(id).orElse(null);
        if(orders1 !=null){
            orders1.setOrderstatus(orders.getOrderstatus());
            orders1.setQuantity(orders.getQuantity());
           return orderRepository.save(orders1);
        }
        return null;
    }

    public Orders delete(Integer id) {
        if(orderRepository.existsById(id)){
            orderRepository.deleteById(id);
        }
        return null;
    }
}
