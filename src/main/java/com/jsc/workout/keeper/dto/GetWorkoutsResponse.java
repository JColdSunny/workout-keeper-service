package com.jsc.workout.keeper.dto;

import java.util.List;

public record GetWorkoutsResponse(List<WorkoutDto> workouts) {
}
