package com.jsc.workout.keeper.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public record WorkoutDto(
        String workoutId,
        String name,
        LocalDate data,
        LocalTime start,
        LocalTime end,
        List<ExerciseDto> exercises) {
}
