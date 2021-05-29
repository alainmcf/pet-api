package com.pumapunku.pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PetApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(PetApplication.class, args);
    }
}
