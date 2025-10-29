package org.example.array;

public class Test {
    public static void main(String[] args) {
        Student[] arr = {new Student(10, "Ram"), new Student(12, "Shama"), new Student(15, "Raj")};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getAge() + " " + arr[i].getName());
        }

    }
}
