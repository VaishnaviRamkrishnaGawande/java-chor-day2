package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile1 {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt");
             FileOutputStream fos = new FileOutputStream("copytest1.txt")) {
             
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
    }
}
