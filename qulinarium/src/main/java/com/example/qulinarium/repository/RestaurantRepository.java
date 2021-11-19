package com.example.qulinarium.repository;

import com.example.qulinarium.model.Dish;
import com.example.qulinarium.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

   /* @Query("SELECT r.restaurantName FROM Restaurant r ")       //where id restaurant
    public List<String> findRestaurantNames();*/

    @Query("SELECT r FROM Restaurant r ")       //where id restaurant
    public List<Restaurant> findRestaurantNames();

    @Query("SELECT r.id FROM Restaurant r ")       //where id restaurant
    public List<Long> findRestaurantId();


}
