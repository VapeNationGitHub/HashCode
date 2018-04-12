package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        String Str = new String("Пономарев Никита");
        System.out.println("Хэш-код: " + Str.hashCode() % 10);
    }

}
