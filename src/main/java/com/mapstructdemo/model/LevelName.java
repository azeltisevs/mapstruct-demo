package com.mapstructdemo.model;

import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@Getter
public enum LevelName {

    UNKNOWN("Unknown"),
    CONSULTANT("Consultant"),
    SENIOR_CONSULTANT("Senior Consultant"),
    ASSOCIATE_CONSULTANT("Associate Consultant"),
    PRINCIPAL_CONSULTANT("Principal Consultant"),
    MANAGING_PRINCIPAL("Managing Principal"),
    PARTNER("Partner");

    private final String levelName;

    LevelName(String levelName) {
        this.levelName = levelName;
    }

    public static LevelName getByName(String name) {
        return Arrays.stream(values())
                .filter(v -> Objects.equals(name, v.levelName))
                .findFirst()
                .orElse(UNKNOWN);
    }
}