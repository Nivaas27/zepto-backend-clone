package com.spring.zepto.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    private Integer productid;
    private String  productcategory;
    private String  productname;
    private Integer price;
}
