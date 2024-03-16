package com.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    
    public static void main(String[] args){

        SpringApplication.run(Main.class, args);

    }

    @GetMapping("/")
    public GreetResponse greet(){

        return new GreetResponse
        (
            "Hello", 
           List.of("Javascript", "Java", "Python"), 
            new Person("Davi", 21, 0.1)
        );

    }

    record Person(String name, int age, double savings){};
    
    record GreetResponse(String greet, List<String> favProgrammingLanguages, Person person){

            public GreetResponse(String greet, List<String> favProgrammingLanguages, Person person){

                this.greet = greet; 
                this.favProgrammingLanguages = favProgrammingLanguages; 
                this.person = person; 

            }


        }

}
