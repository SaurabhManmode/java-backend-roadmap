package org.example.java8.trywithresources;

import java.io.*;
import java.util.Scanner;

public class TryWithResourcesExample {

    // Custom AutoCloseable resource
    static class DatabaseConnection implements AutoCloseable {
        private String name;

        public DatabaseConnection(String name) {
            this.name = name;
            System.out.println("Opening connection: " + name);
        }

        public void query(String sql) {
            System.out.println("Executing on [" + name + "]: " + sql);
        }

        @Override
        public void close() {
            System.out.println("Closing connection: " + name);
        }
    }

    // ── Example 1: Single resource ──────────────────────────────────────────
    static void singleResource() throws IOException {
        System.out.println("\n--- Example 1: Single Resource (FileReader) ---");

        // Creates a temp file to read
        File temp = File.createTempFile("demo", ".txt");
        try (PrintWriter pw = new PrintWriter(temp)) {
            pw.println("Hello from try-with-resources!");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(temp))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } // br.close() called automatically here
        System.out.println("BufferedReader closed automatically.");
    }

    // ── Example 2: Multiple resources ───────────────────────────────────────
    static void multipleResources() throws IOException {
        System.out.println("\n--- Example 2: Multiple Resources ---");

        File input  = File.createTempFile("input",  ".txt");
        File output = File.createTempFile("output", ".txt");

        // Write some data first
        try (PrintWriter pw = new PrintWriter(input)) {
            pw.println("Line 1");
            pw.println("Line 2");
            pw.println("Line 3");
        }

        // Both reader and writer opened; closed in REVERSE order (writer → reader)
        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            System.out.println("File copied. Resources will close in reverse order.");
        }
    }

    // ── Example 3: Custom AutoCloseable ─────────────────────────────────────
    static void customResource() {
        System.out.println("\n--- Example 3: Custom AutoCloseable ---");

        try (DatabaseConnection conn = new DatabaseConnection("MySQL-DB")) {
            conn.query("SELECT * FROM users");
            conn.query("SELECT * FROM orders");
        } // close() called automatically
        System.out.println("Connection closed automatically.");
    }

    // ── Example 4: Exception during resource use ─────────────────────────────
    static void exceptionHandling() {
        System.out.println("\n--- Example 4: Exception Handling ---");

        try (DatabaseConnection conn = new DatabaseConnection("Postgres-DB")) {
            conn.query("SELECT * FROM inventory");
            if (true) throw new RuntimeException("Simulated DB error!");
            conn.query("This line won't run");
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        // close() was still called before the catch block ran
        System.out.println("Notice: close() ran even though exception was thrown.");
    }

    // ── Example 5: Scanner (common real-world use) ───────────────────────────
    static void scannerExample() throws IOException {
        System.out.println("\n--- Example 5: Scanner ---");

        File temp = File.createTempFile("numbers", ".txt");
        try (PrintWriter pw = new PrintWriter(temp)) {
            pw.println("10 20 30 40 50");
        }

        try (Scanner scanner = new Scanner(temp)) {
            int sum = 0;
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }
            System.out.println("Sum of numbers: " + sum);
        }
    }

    // ── Main ─────────────────────────────────────────────────────────────────
    public static void main(String[] args) throws IOException {
        singleResource();
        multipleResources();
        customResource();
        exceptionHandling();
        scannerExample();

        System.out.println("\nAll examples completed successfully!");
    }
}