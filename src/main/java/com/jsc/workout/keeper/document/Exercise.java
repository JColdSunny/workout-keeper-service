package com.jsc.workout.keeper.document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "exerciseId")
public class Exercise {
    private String exerciseId;

    private String name;

    private List<Set> sets;

}
