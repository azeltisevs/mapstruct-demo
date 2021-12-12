package com.mapstructdemo.mapstruct;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommonMappings {

    default String mapFullName(String firstName, String lastName) {
        return lastName == null ? firstName : nullable(firstName) + " " + nullable(lastName);
    }

    default String nullable(String s) {
        return s == null ? "" : s;
    }
}
