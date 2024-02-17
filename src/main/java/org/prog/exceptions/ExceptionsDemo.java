package org.prog.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


//TODO: Catch parent exceptions (EXception / Throwable)
//TODO: Catch specific exception
//TODO: Convert FileNotFoundException into Throwable in readFile3
//TODO: Process Throwable in readFile1
public class ExceptionsDemo {
//Домашнее задание (Session 3)
    public static void main(String[] args){
        readFile1();
        }

    public static void readFile1(){
        try {
            readFile2();
        }catch (Throwable e){
            System.out.println("Caught Throwable with message: " + e. getMessage());
        }
    }

    public static void readFile2() throws Throwable {
        readFile3();
    }

    public static void readFile3() throws Throwable {
        try {
            readFile4();
        } catch (FileNotFoundException e){
            throw new Throwable(e. getMessage());
        }

    }

    public static void readFile4() throws FileNotFoundException{
        try {
            readFile5();
        } catch (Throwable e) {
            throw new FileNotFoundException("File not found");
        }
    }

    public static void readFile5() throws FileNotFoundException {
        File f = new File("e. getMessage");
        FileReader fileReader = new FileReader(f);
        f.setReadable(true);
    }
}
