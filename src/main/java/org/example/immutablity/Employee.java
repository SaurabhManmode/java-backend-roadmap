package org.example.immutablity;

import java.util.ArrayList;
import java.util.List;

public final class Employee {

    private final String name;
    private final int age;
    private final List<String> skills;

    private final Address address;

    public Employee(String name, int age, List<String> skills, Address address) {
        this.name = name;
        this.age = age;
        // defensive copy
        this.skills = new ArrayList<>(skills);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }

    public List<String> getSkills() {
        //return copy
        return new ArrayList<>(skills);
    }
}
