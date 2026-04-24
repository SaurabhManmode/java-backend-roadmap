package org.example.immutablity;

import java.util.List;

public class ImmutabilityTest {

    public static void main(String[] args) {
        Employee e = new Employee("Saurabh",10, List.of("Java","SpringBoot","AWS"));
        e.getSkills().add("docker"); // dont have affect on e
        System.out.println(e);
    }
}
