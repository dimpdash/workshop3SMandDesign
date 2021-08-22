package com.unimelb.swen30006.workshops;

import java.util.Date;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;

public class Subject {

    private String name;
    private String subjectCode;
    private List<Assignment> assignments;

    public void createAssignment(String description, Date dueDate, int maxAttempts, String name) {

        this.assignments.add(new Assignment(description, dueDate, maxAttempts, name));
    }
    public void deleteAssignment(String name) {

        this.assignments.removeIf(a -> Objects.equals(a.getName(), name));
    }
}
