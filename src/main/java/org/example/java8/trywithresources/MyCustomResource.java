package org.example.java8.trywithresources;

public class MyCustomResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Resource closed");
    }
}
