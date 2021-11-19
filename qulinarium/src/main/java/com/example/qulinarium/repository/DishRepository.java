package com.example.qulinarium.repository;

import com.example.qulinarium.model.Dish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, String> {

    @Query("SELECT d FROM Dish d WHERE d.restaurantName = ?1")
    public List<Dish> findDishes(String restaurantName);


}
