package com.spring.zepto.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    @Id
    private Integer orderid;
    @ManyToOne
    @JoinColumn (name ="user_id")
    User user;
    @ManyToOne
    @JoinColumn (name ="productid")
    Product product;
    private Integer quantity;
    private String orderstatus;
}
