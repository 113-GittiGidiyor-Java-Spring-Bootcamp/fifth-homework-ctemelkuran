package dev.patika.schoolmanagementhw05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SchoolManagementHw05Application {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementHw05Application.class, args);
    }

}
