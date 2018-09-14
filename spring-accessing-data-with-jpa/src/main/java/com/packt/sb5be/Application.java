package com.packt.sb5be;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
//@ComponentScan("com.packt.sb5be.searchapp.dbmodel.orm")
@EnableJpaRepositories("com.packt.sb5be")
@EntityScan("com.packt.sb5be.*")
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    TopicRepository repository;


    public static void main(String[] args)
    {
        SpringApplication.run(Application.class);
    }

    @Bean
//    public CommandLineRunner demo(TopicRepository repository)
    public CommandLineRunner commandLineRunner(ApplicationContext ctx)
    {
        return (args) ->
        {
/*
            // save a couple of customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));
*/
             // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            //for (Customer customer : repository.findAll()) {
            for (Topic customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
/*
            // fetch an individual customer by ID
            repository.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Customer found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            // 	log.info(bauer.toString());
            // }
            log.info("");
*/

        };
    }
}
