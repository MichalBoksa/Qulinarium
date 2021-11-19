package com.example.qulinarium.repository;

import com.example.qulinarium.model.Dish;
import com.example.qulinarium.model.Order;
import com.example.qulinarium.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    @Query("SELECT d FROM Order d WHERE d.userId = ?1")
    public List<Order> findOrders(Long userId);


}
