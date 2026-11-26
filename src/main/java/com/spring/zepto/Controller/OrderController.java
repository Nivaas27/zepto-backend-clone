package com.spring.zepto.Controller;

import com.spring.zepto.Entity.Orders;
import com.spring.zepto.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/insert")
    public List<Orders> insert(@RequestBody List<Orders> orders){
        return orderService.insert(orders);
    }
    @GetMapping("/fetchall")
    public List<Orders> fetchall(){
        return orderService.fetchall();
    }
    @GetMapping("/fetch/{id}")
    public Orders fetch(@PathVariable Integer id){
        return orderService.fetch(id);
    }
    @PutMapping("/update/{id}")
    public Orders update(@RequestBody Orders orders,@PathVariable Integer id){
        return orderService.update(orders,id);
    }
    @DeleteMapping("/delete/{id}")
    public Orders delete(@PathVariable Integer id){
        return orderService.delete(id);
    }


}
