package org.example.exceptions;

public class MyResource implements  AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("closed resource");
    }
}
