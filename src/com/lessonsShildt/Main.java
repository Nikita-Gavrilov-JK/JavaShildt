package com.lessonsShildt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jojo jojo= new Jojo();

        int i = scanner.nextInt();
        jojo.print(34,i);
        System.out.println("Hello world!" + i);
    }
}