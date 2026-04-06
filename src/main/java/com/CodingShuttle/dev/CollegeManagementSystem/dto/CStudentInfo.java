package com.CodingShuttle.dev.CollegeManagementSystem.dto;

import lombok.Data;
import lombok.ToString;

@Data

public class CStudentInfo {
    public CStudentInfo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CStudentInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private final Long id ;
    private final String name ;
}
