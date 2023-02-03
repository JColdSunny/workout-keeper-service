package com.jsc.workout.keeper.api;

import com.jsc.workout.keeper.dto.GetWorkoutsResponse;
import com.jsc.workout.keeper.dto.SaveWorkoutRequest;
import com.jsc.workout.keeper.dto.SaveWorkoutResponse;
import com.jsc.workout.keeper.dto.UpdateWorkoutRequest;
import com.jsc.workout.keeper.dto.UpdateWorkoutResponse;
import com.jsc.workout.keeper.service.WorkoutService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workouts")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WorkoutController {
    WorkoutService workoutService;

    @GetMapping
    public ResponseEntity<GetWorkoutsResponse> getAllWorkouts() {
        return ResponseEntity.ok(workoutService.getAll());
    }

    @PostMapping
    public ResponseEntity<SaveWorkoutResponse> saveWorkout(@RequestBody SaveWorkoutRequest request) {
        return ResponseEntity.ok(workoutService.save(request));
    }

    @PutMapping
    public ResponseEntity<UpdateWorkoutResponse> updateWorkout(@RequestBody UpdateWorkoutRequest request) {
        return ResponseEntity.ok(workoutService.update(request));
    }

    @DeleteMapping("/{workoutId}")
    public ResponseEntity<Void> deleteWorkout(@PathVariable String workoutId) {
        workoutService.delete(workoutId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
