package com.example.a3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class A3Application {

    public static void main(String[] args) {
        SpringApplication.run(A3Application.class, args);
    }

    public static int elo (int x, int y){
        return x * y;
    }

}
