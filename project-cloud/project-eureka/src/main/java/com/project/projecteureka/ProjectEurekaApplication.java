package com.project.projecteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EurekaServer
@SpringBootApplication
public class ProjectEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectEurekaApplication.class, args);
    }

}
