package com.jsc.workout.keeper.document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "workoutId")
@Document("workouts")
public class Workout {

    @Id
    private String workoutId;

    private String name;

    private List<Exercise> exercises;

}
