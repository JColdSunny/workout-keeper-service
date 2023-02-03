package com.jsc.workout.keeper.service;

import com.jsc.workout.keeper.document.Workout;
import com.jsc.workout.keeper.dto.GetWorkoutsResponse;
import com.jsc.workout.keeper.dto.SaveWorkoutRequest;
import com.jsc.workout.keeper.dto.SaveWorkoutResponse;
import com.jsc.workout.keeper.dto.UpdateWorkoutRequest;
import com.jsc.workout.keeper.dto.UpdateWorkoutResponse;
import com.jsc.workout.keeper.dto.WorkoutDto;
import com.jsc.workout.keeper.mapper.WorkoutMapper;
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
    WorkoutMapper workoutMapper;

    public GetWorkoutsResponse getAll() {
        List<WorkoutDto> workouts = workoutRepository.findAll().stream()
                .map(workoutMapper::toDto)
                .toList();

        return new GetWorkoutsResponse(workouts);
    }

    public SaveWorkoutResponse save(@NonNull SaveWorkoutRequest request) {
        Workout workout = workoutMapper.toDocument(request.workout());
        Workout savedWorkout = workoutRepository.save(workout);
        return new SaveWorkoutResponse(workoutMapper.toDto(savedWorkout));
    }

    public UpdateWorkoutResponse update(@NonNull UpdateWorkoutRequest request) {
        Workout workout = workoutMapper.toDocument(request.workout());

        if (!workoutRepository.existsById(workout.getWorkoutId())) {
            throw new RuntimeException("");
        }
        Workout savedWorkout = workoutRepository.save(workout);
        return new UpdateWorkoutResponse(workoutMapper.toDto(savedWorkout));
    }

    public void delete(@NonNull String workoutId) {
        workoutRepository.deleteById(workoutId);
    }

}
