package com.packt.sb5be;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx)
    {
        return args ->
        {
            System.out.println("Beans provided by the SpringBoot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames)
            {
                System.out.println("Ime beana: " + beanName);
            }
        };
    }
}
