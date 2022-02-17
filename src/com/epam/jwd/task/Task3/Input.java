package com.epam.jwd.task.Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    static public void runSecond() {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
            System.out.println("Введите первое число: ");
            a = sc.nextInt();
            System.out.println("Введите второе число: ");
            b = sc.nextInt();
            System.out.println("Введите третье число: ");
            c = sc.nextInt();
            Logic.second(a,b,c);
    }
    static public void runThird(){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0;
            System.out.println("Введите первое число: ");
            a = sc.nextInt();
            System.out.println("Введите второе число: ");
            b = sc.nextInt();
            Logic.third(a,b);

    }
    static public void runFourth(){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0;
            System.out.println("Введите первое число: ");
            a = sc.nextInt();
            System.out.println("Введите второе число: ");
            b = sc.nextInt();
            Logic.fourth(a,b);

    }
}
