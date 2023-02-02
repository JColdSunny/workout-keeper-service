package com.jsc.workout.keeper.document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Document("workouts")
@EqualsAndHashCode(of = "workoutId")
public class Workout {

    @Id
    private String workoutId;

    private String name;

    private LocalDateTime start;

    private LocalDateTime end;

    private List<Exercise> exercises;

}
