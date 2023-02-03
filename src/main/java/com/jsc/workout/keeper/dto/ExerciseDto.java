package com.jsc.workout.keeper.dto;

import java.util.List;

public record ExerciseDto(String exerciseId, String name, List<SetDto> sets) {
}
