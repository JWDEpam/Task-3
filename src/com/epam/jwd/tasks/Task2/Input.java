package com.epam.jwd.tasks.Task2;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static public void runSecond(){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0,c = 0;
        int checkException = 0;
        try {
            System.out.println("Введите первое число: ");
            a = sc.nextInt();
            System.out.println("Введите второе число: ");
            b = sc.nextInt();
            System.out.println("Введите третье число: ");
            c = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Сказали же ввести число...");
            checkException = 1;
        }
        if (checkException == 0){
            Logic.second(a,b,c);
        }
    }
    static public void runThird(){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0;
        int checkException = 0;
        try {
            System.out.println("Введите первое число: ");
            a = sc.nextInt();
            System.out.println("Введите второе число: ");
            b = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Сказали же ввести число... \n Давай по новой!");
            runSecond();
        }
        if (checkException == 0){
            Logic.third(a,b);
        }

    }
    static public void runFourth(){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0;
        int checkException = 0;
        try {
            System.out.println("Введите первое число: ");
            a = sc.nextInt();
            System.out.println("Введите второе число: ");
            b = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Сказали же ввести число... \n Давай по новой!");
            runSecond();
        }
        if (checkException == 0){
            Logic.fourth(a,b);
        }

    }
}
