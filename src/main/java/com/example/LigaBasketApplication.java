package com.example;

import com.example.Services.JugadorServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBasketApplication {

    private static JugadorServices jugadorServices;
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(LigaBasketApplication.class, args);
        jugadorServices = context.getBean(JugadorServices.class);
        jugadorServices.addJugador();
    }
}
