package com.example.qulinarium.model;

import com.example.qulinarium.converter.StringToListConverter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long userId;


    // @Convert(converter = StringToListConverter.class) W przypadku listy
    @Column
    private String orderedDishes;

    @Column
    private Double price;

    @Column
    private String restName;


    public Order() {
    }

    public Order(Long userId, String orderedDishes, Double price, String restName) {
        this.userId = userId;
        this.orderedDishes = orderedDishes;
        this.price = price;
        this.restName = restName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

   public String getOrderedDishes() {
        return orderedDishes;
    }

    public void setOrderedDishes(String orderedDishes) {
        this.orderedDishes = orderedDishes;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }
}
