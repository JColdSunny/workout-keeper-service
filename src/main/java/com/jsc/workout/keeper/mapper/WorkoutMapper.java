package com.jsc.workout.keeper.mapper;

import com.jsc.workout.keeper.document.Workout;
import com.jsc.workout.keeper.dto.WorkoutDto;
import org.mapstruct.Mapper;

@Mapper
public abstract class WorkoutMapper {

    public abstract WorkoutDto toDto(Workout workout);

    public abstract Workout toDocument(WorkoutDto workoutDto);

}
