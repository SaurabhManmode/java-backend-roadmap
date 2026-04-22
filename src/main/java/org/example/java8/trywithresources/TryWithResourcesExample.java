package org.example.java8.trywithresources;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {


    public static void main(String[] args) {
        // before try with resources
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("data.text"));
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // solution try with the resources // reduced boiler plate no need to write finally

        try (BufferedReader b = new BufferedReader(new FileReader("data.txt"))) {
            System.out.println(b.readLine());
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        // using custom resource
        try(MyCustomResource mr  = new MyCustomResource()){

        }catch (Exception e){

        }


    }

}