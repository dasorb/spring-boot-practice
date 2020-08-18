package com.dasorb.dasorbcron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DasorbCronApplication {

    public static void main(String[] args) {
        SpringApplication.run(DasorbCronApplication.class, args);
    }

}
