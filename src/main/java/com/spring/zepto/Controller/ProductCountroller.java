package com.spring.zepto.Controller;

import com.spring.zepto.Entity.Product;
import com.spring.zepto.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductCountroller {
    @Autowired
    ProductService productService;
    @PostMapping("/insertall")
    public List<Product> insertall(@RequestBody List<Product> products)
    {
        return productService.insertall(products);
    }
    @PostMapping("/insert")
    public Product insert(@RequestBody Product products){
        return productService.insert(products);
    }
    @GetMapping("/fetchall")
    public List<Product> fetchall(@RequestBody List<Product> products){
        return productService.fetchall(products);
    }
    @GetMapping("/fetchby/{id}")
    public Product fetchbyid(@PathVariable Integer id){
        return productService.fetchbyid(id);
    }
    @PutMapping("/updateby/{id}")
    public Product updateby(@RequestBody Product products,@PathVariable Integer id){
        return productService.updateby(products,id);
    }
    @DeleteMapping("/deleteby/{id}")
    public Product deletebyid(@PathVariable Integer id){
        return  productService.deleteby(id);
    }

}
