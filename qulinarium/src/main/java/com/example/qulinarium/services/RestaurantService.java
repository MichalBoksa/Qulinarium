package com.example.qulinarium.services;

import com.example.qulinarium.model.Dish;
import com.example.qulinarium.model.Restaurant;
import com.example.qulinarium.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {


    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }



    public List<Restaurant> findRestaurantNames() {
        return restaurantRepository.findRestaurantNames();
    }
}
