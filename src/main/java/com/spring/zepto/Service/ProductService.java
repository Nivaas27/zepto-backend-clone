package com.spring.zepto.Service;

import com.spring.zepto.Entity.Product;
import com.spring.zepto.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> insertall(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public  List<Product> fetchall(List<Product> products) {
        return productRepository.findAll();
    }

    public Product fetchbyid(Integer id) {
            return productRepository.findById(id).orElse(null);
    }

    public Product insert(Product products) {
        return productRepository.save(products);
    }

    public Product updateby(Product products, Integer id) {
        Product product1 = productRepository.findById(id).orElse(null);
        if(product1 != null){
            product1.setPrice(products.getPrice());
            product1.setProductcategory(products.getProductcategory());
            product1.setProductname(products.getProductname());
            return productRepository.save(product1);
        }
        return null;
    }

    public Product deleteby(Integer id) {
                if(productRepository.existsById(id)){
                    productRepository.deleteById(id);
                }
                return null;
    }
}
