package com.example.qulinarium.config;

import com.example.qulinarium.model.Dish;
import com.example.qulinarium.model.Restaurant;
import com.example.qulinarium.repository.DishRepository;
import com.example.qulinarium.repository.RestaurantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class RestaurantConfig {

    @Bean
    CommandLineRunner commandLineRunner(RestaurantRepository repositoryRestaurant, DishRepository repositoryDish) {

        return args -> {
            Restaurant daGrasso = new Restaurant(
                    "daGrasso"
            );

            Restaurant pizzaHut = new Restaurant(
                    "pizzaHut"
            );

            Restaurant GrubyBenek = new Restaurant(
                    "Gruby Benek"
            );
            Restaurant Fierro = new Restaurant(
                    "Fierro"
            );

            Restaurant Avangarde = new Restaurant(
                    "Avangarde"
            );

            Restaurant Deportivo = new Restaurant(
                    "Deportivo"
            );


            repositoryRestaurant.save(daGrasso);
            repositoryRestaurant.save(pizzaHut);
            repositoryRestaurant.save(GrubyBenek);
            repositoryRestaurant.save(Fierro);
            repositoryRestaurant.save(Avangarde);
            repositoryRestaurant.save(Deportivo);



            //// DISH REPO


            Dish Margherita = new Dish(
                    "Margherita","ser", "daGrasso",22.0
            );

            Dish Margherita2 = new Dish(
                    "Margherita","ser", "pizzaHut",23.0
            );


            Dish Margherita3 = new Dish(
                    "Margherita","ser", "Gruby Benek",22.5
            );


            Dish salami = new Dish(
                    "Salami","ser, salami", "daGrasso",24.0
            );

            Dish salami2 = new Dish(
                    "Salami","ser,salami", "pizzaHut",24.0
            );


            Dish salami3 = new Dish(
                    "Salami","ser, salami", "Gruby Benek",24.5
            );

            Dish capriciosa = new Dish(
                    "Capriciosa","ser, szynka, pieczarki", "daGrasso",24.0
            );

            Dish capriciosa2 = new Dish(
                    "Capriciosa","ser,szynka, pieczarki", "pizzaHut",24.0
            );


            Dish capriciosa3 = new Dish(
                    "Capriciosa","ser, szynka, salami", "Gruby Benek",24.5
            );

            Dish hawajska = new Dish(
                    "Hawajska","ser, szynka, ananas", "daGrasso",24.0
            );

            Dish hawajska2 = new Dish(
                    "Hawjska","ser,szynka, ananas", "pizzaHut",24.0
            );


            Dish hawajska3 = new Dish(
                    "Hawajska","ser, szynka, ananas", "Gruby Benek",24.5
            );

            Dish Margherita4 = new Dish(
                    "Margherita","ser", "daGrasso",22.0
            );

            Dish Margherita5 = new Dish(
                    "Margherita","ser", "pizzaHut",23.0
            );


            Dish Margherita6 = new Dish(
                    "Margherita","ser", "Gruby Benek",22.5
            );

            Dish Margherita7 = new Dish(
                    "Margherita","ser", "Fierro",22.5
            );

            Dish Margherita8 = new Dish(
                    "Margherita","ser", "Avangarde",22.5
            );


            Dish salami4 = new Dish(
                    "Salami","ser, salami", "daGrasso",24.0
            );

            Dish salami5 = new Dish(
                    "Salami","ser,salami", "pizzaHut",24.0
            );


            Dish salami6 = new Dish(
                    "Salami","ser, salami", "Gruby Benek",24.5
            );

            Dish salami7 = new Dish(
                    "Salami","ser, salami", "Fierro",24.5
            );

            Dish salami8 = new Dish(
                    "Salami","ser, salami", "Avangarde",24.5
            );

            Dish salami9 = new Dish(
                    "Salami","ser, salami", "Deportivo",24.5
            );

            Dish capriciosa4 = new Dish(
                    "Capriciosa","ser, szynka, pieczarki", "daGrasso",24.0
            );

            Dish capriciosa5 = new Dish(
                    "Capriciosa","ser,szynka, pieczarki", "pizzaHut",24.0
            );



            Dish capriciosa6 = new Dish(
                    "Capriciosa","ser, szynka, salami", "Gruby Benek",24.5
            );

            Dish capriciosa7 = new Dish(
                    "Capriciosa","ser,szynka, pieczarki", "Fierro",24.0
            );

            Dish capriciosa8 = new Dish(
                    "Capriciosa","ser,szynka, pieczarki", "Avangarde",24.0
            );

            Dish capriciosa9 = new Dish(
                    "Capriciosa","ser,szynka, pieczarki", "Deportivo",24.0
            );

            Dish hawajska4 = new Dish(
                    "Hawajska","ser, szynka, ananas", "daGrasso",24.0
            );

            Dish hawajska5 = new Dish(
                    "Hawjska","ser,szynka, ananas", "pizzaHut",24.0
            );


            Dish hawajska6 = new Dish(
                    "Hawajska","ser, szynka, ananas", "Gruby Benek",24.5
            );

            Dish hawajska7 = new Dish(
                    "Hawajska","ser, szynka, ananas", "Fierro",24.5
            );
            Dish hawajska8 = new Dish(
                    "Hawajska","ser, szynka, ananas", "Deportivo",24.5
            );



            repositoryDish.save(Margherita);
            repositoryDish.save(Margherita2);
            repositoryDish.save(Margherita3);
            repositoryDish.save(Margherita4);
            repositoryDish.save(Margherita5);
            repositoryDish.save(Margherita6);
            repositoryDish.save(Margherita7);
            repositoryDish.save(Margherita8);
            repositoryDish.save(salami);
            repositoryDish.save(salami2);
            repositoryDish.save(salami3);
            repositoryDish.save(salami4);
            repositoryDish.save(salami5);
            repositoryDish.save(salami6);
            repositoryDish.save(salami7);
            repositoryDish.save(salami8);
            repositoryDish.save(salami9);
            repositoryDish.save(capriciosa);
            repositoryDish.save(capriciosa2);
            repositoryDish.save(capriciosa3);
            repositoryDish.save(capriciosa4);
            repositoryDish.save(capriciosa5);
            repositoryDish.save(capriciosa6);
            repositoryDish.save(capriciosa7);
            repositoryDish.save(capriciosa8);
            repositoryDish.save(capriciosa9);
            repositoryDish.save(hawajska);
            repositoryDish.save(hawajska2);
            repositoryDish.save(hawajska3);
            repositoryDish.save(hawajska4);
            repositoryDish.save(hawajska5);
            repositoryDish.save(hawajska6);
            repositoryDish.save(hawajska7);
            repositoryDish.save(hawajska8);
        };

    }
}
