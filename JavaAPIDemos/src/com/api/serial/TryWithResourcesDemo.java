package com.api.serial;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try(
                FileWriter fileWriter = new FileWriter("Demo.txt");
                FileReader fileReader =new FileReader("trail.txt");
                ){

            int num = fileReader.read();
            fileWriter.write((char) num);
            do {
                num = fileReader.read();
                fileWriter.write((char) num);
            } while (num != -1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
