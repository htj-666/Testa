package com;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Student extends Person {
    static int i = 20;
    public Student(){
        i--;
    }
    public static void main(String[] args) throws InterruptedException {
        int i = 10;
        i = i++;
        System.out.println(i);
    }
}