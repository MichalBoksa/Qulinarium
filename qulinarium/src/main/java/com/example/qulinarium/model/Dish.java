package com.example.qulinarium.model;

import javax.persistence.*;

@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String dishName;

    @Column
    private String ingredients;

    @Column
    private String restaurantName;

    @Column
    private Double price;

    public Dish() {
    }

    public Dish(String dishName, String ingredients, String restaurantName, Double price) {
        this.dishName = dishName;
        this.ingredients = ingredients;
        this.restaurantName = restaurantName;
        this.price = price;

    } 

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
