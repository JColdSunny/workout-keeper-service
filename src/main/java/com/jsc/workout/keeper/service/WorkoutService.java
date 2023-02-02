package com.jsc.workout.keeper.service;

import com.jsc.workout.keeper.document.Workout;
import com.jsc.workout.keeper.repository.WorkoutRepository;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WorkoutService {
    WorkoutRepository workoutRepository;

    public List<Workout> getAll() {
        return workoutRepository.findAll();
    }

    public String save(@NonNull Workout workout) {
        Workout savedWorkout = workoutRepository.save(workout);
        return savedWorkout.getWorkoutId();
    }

}
