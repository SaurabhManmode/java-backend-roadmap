package org.example.java8features;

import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodReferencesEx {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> list = List.of("Saurabh", "Manmode", "Beed");

        //using method reference
        list.stream().forEach(MethodReferencesEx::print);

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        integers.forEach(MathUtil::square);


        // instance method to particular object
        MathUtil mathUtil = new MathUtil();
        integers.stream().forEach(mathUtil::square2);

        // reference to the instance method of an arbitary object

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // reference to constuctor

        Supplier<Student> student = Student::new;
        student.get();

        //converting list to Hashmap

        HashMap<String, Integer> collect = list.stream()
                .collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, HashMap::new));
        System.out.println(collect);
    }
}

// static reference
class MathUtil {
    public static void square(int n) {
        System.out.print(" " + n * n);
    }

    public void square2(int n) {
        System.out.print(" " + n * n);
    }
}

class Student {
    Student() {
        System.out.println("Student object created");
    }
}

