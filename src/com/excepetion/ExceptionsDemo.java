package com.excepetion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (reader != null){
                try {
                    reader.close();
                }catch (IOException e){
                    e.getStackTrace();
                }
            }
        }
    }
}
