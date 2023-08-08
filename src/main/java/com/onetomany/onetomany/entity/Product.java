package com.onetomany.onetomany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    private  int pid;
    private String productName;
    private int qty;
    private int price;
}
