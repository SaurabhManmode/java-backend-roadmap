package org.example.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
        // before introduction of try with resources
        Scanner sc = null;
        try {
            sc = new Scanner(new File("text.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        // try -with resources
        try (Scanner sc2 = new Scanner(new File("text.txt"))) {
            while (sc2.hasNextLine()) {
                System.out.println(sc2.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //try with multiple resources
        try (Scanner sc3 = new Scanner(new File("text.txt"));
             PrintWriter writer = new PrintWriter(new File("textwrite.txt"))
        ) {
            while (sc3.hasNext()) {
                writer.print(sc3.hasNext());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //custom resource

        try(MyResource myResource= new MyResource()){

        }catch (Exception e){
            
        }

    }
}
