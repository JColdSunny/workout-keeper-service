package com.jsc.workout.keeper.document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Document("workouts")
@EqualsAndHashCode(of = "workoutId")
public class Workout {

    @Id
    private String workoutId;

    private String name;

    private LocalDate date;

    private LocalTime start;

    private LocalTime end;

    private List<Exercise> exercises;

}
