package com.example.qulinarium.controller;

import com.example.qulinarium.model.Dish;
import com.example.qulinarium.model.Order;
import com.example.qulinarium.model.Restaurant;
import com.example.qulinarium.model.User;
import com.example.qulinarium.repository.OrderRepository;
import com.example.qulinarium.repository.UserRepository;
import com.example.qulinarium.services.DishService;
import com.example.qulinarium.services.OrderService;
import com.example.qulinarium.services.RestaurantService;
import com.example.qulinarium.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.*;

import java.util.List;

@Controller
public class ApplicationController {

    private final RestaurantService restaurantService;
    private final DishService dishService;
    private UserService userService;
    private OrderService orderService;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    public ApplicationController(RestaurantService restaurantService, DishService dishService, UserService userService, OrderService orderService) {
        this.restaurantService = restaurantService;
        this.dishService = dishService;
        this.userService = userService;
        this.orderService = orderService;
            }


            @GetMapping("/")
           public String showHomePage (Model model)
            {
                List<Restaurant> restaurantNamesList = restaurantService.findRestaurantNames();
                model.addAttribute("restaurantNamesList", restaurantNamesList);

                return "index";
            }


            @GetMapping("/restaurant")
            public String showRestaurantPage(@RequestParam(required = false, name = "restName") String restaurantName, Model model){

                List<Dish> dishesList = dishService.findDishes(restaurantName);
                model.addAttribute("dishesList", dishesList);
                model.addAttribute("order", new Order());


                return "restaurant";

            }




    @GetMapping("/login")
            public String showLoginPage(){
            return "login";
    }

            @GetMapping("/register")
            public String showRegisterPage(Model model){

                model.addAttribute("user", new User());

                return "register";
            }

            @PostMapping("/registerSucceed")
            public String showCompletedRegisterPage(User user){
                BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                String encodedPassword = passwordEncoder.encode(user.getPassword());
                user.setPassword(encodedPassword);

                userRepository.save(user);
                return "post_register";
            }



            @PostMapping("/post_order")
            public String showCompletedOrder(Order order){
              Authentication auth = SecurityContextHolder.getContext().getAuthentication();
              User user = (User)auth.getPrincipal();
              Long userId = user.getId();
              order.setUserId(userId);
              orderRepository.save(order);
                 return "post_order";
    }


    @GetMapping("/order_history")
    public String showOrderHistory(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = (User)auth.getPrincipal();
        Long userId = user.getId();

        List<Order>orderList = orderService.findOrders(userId);
        model.addAttribute("orderList",orderList);
        return "order_history";
    }


}
