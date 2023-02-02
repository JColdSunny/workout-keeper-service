package com.jsc.workout.keeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class WorkoutKeeperService {

    public static void main(String[] args) {
        SpringApplication.run(WorkoutKeeperService.class, args);
    }

}
