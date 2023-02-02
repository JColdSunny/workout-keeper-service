package com.jsc.workout.keeper.api;

import com.jsc.workout.keeper.document.Workout;
import com.jsc.workout.keeper.service.WorkoutService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workouts")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WorkoutController {
    WorkoutService workoutService;

    @GetMapping
    public ResponseEntity<List<Workout>> getAllWorkouts() {
        return ResponseEntity.ok(workoutService.getAll());
    }

    @PostMapping
    public ResponseEntity<String> saveWorkout(@RequestBody Workout workout) {
        return ResponseEntity.ok(workoutService.save(workout));
    }

    @PutMapping
    public ResponseEntity<String> updateWorkout(@RequestBody Workout workout) {
        return ResponseEntity.ok(workoutService.save(workout));
    }

}
