package com.example.qulinarium.services;

import com.example.qulinarium.model.Dish;
import com.example.qulinarium.repository.DishRepository;
import com.example.qulinarium.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    private final DishRepository dishRepository;

    @Autowired
    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public List<Dish> findDishes(String restaurantName){
        return  dishRepository.findDishes(restaurantName);
    }
}
