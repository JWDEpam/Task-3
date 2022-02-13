package com.epam.jwd.tasks.Task2;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    public static void second(int a,int b ,int c){
        int result = (int) ((b+ Math.sqrt(Math.pow(b,2)+ (4*a*c))/2*a)-Math.pow(1,3)*c+Math.pow(b,-2));
        View.OutSecondTask(result);
    }

    public static void third(int a,int b) {
        int perimetr = (int) (Math.sqrt(Math.pow(a,2)+ Math.pow(b,2))+(a+b));
        int ploshad = (a*b)/2;
        View.OutThirdTask(perimetr, ploshad);
    }
    public static void fourth(int x, int y){
        if ((y < 5 && y > -3) && (x > -4 && x < 4)){
            View.OutFourthTask(true);
        } else {
            View.OutFourthTask(false);
        }}
}
