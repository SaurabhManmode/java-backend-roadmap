package org.example.immutablity;

import java.util.ArrayList;
import java.util.List;

public final class Employee {

    private final String name;
    private final int age;
    private final List<String> skills;

    public Employee(String name, int age, List<String> skills) {
        this.name = name;
        this.age = age;
        // defensive copy
        this.skills = new ArrayList<>(skills);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        //return copy
        return new ArrayList<>(skills);
    }
}
