package com.epam.jwd.task.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void first(int num){
        int firstTwoNum = 0;
        int lastTwoNum = 0;
        char[] strToArray = (String.valueOf(num)).toCharArray();
        List<Integer> cia = new ArrayList<Integer>();
        for (int i = 0;i<strToArray.length; i++){
            int c = Character.getNumericValue(strToArray[i]);
            cia.add(c);
        }
        firstTwoNum = cia.get(0) + cia.get(1);
        lastTwoNum = cia.get(2) + cia.get(3);
        if (firstTwoNum == lastTwoNum){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void second(int a,int b ,int c){
        int result = (int) ((b+ Math.sqrt(Math.pow(b,2)+ (4*a*c))/2*a)-Math.pow(1,3)*c+Math.pow(b,-2));
        System.out.println(result);
    }
    public static void third(int a,int b) {
        int perimetr = (int) (Math.sqrt(Math.pow(a,2)+ Math.pow(b,2))+(a+b));
        int ploshad = (a*b)/2;
        System.out.println("периметр= " + perimetr + " площадь= " + ploshad);
    }
    public static void fourth(int x, int y){
        if ((y < 5 && y > -3) && (x > -4 && x < 4)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }}
    public static void fief (int a, int b, int c){
        if (a<0) {a = (int)Math.pow(4 , a);} else {a = (int)Math.pow(2 , a);}
        if (b<0) {b = (int)Math.pow(4 , b);} else {b = (int)Math.pow(2 , b);}
        if (c<0) {c = (int)Math.pow(4 , c);} else {c = (int)Math.pow(2 , c);}
        System.out.println("a="+a +" b="+b+" c="+c);
    }
    public static void six(int a,int b,int c){
        int max1 = Math.max(a,b);
        int maximum = Math.max(max1,c);
        int min1 = Math.min(a,b);
        int minimum = Math.min(min1,c);
        System.out.println(maximum + minimum);
    }
    public static void seven(int a, int b, int h){
        String result = "";
        double f = 0.0;
        for (int i = a; i<= b; i += h){
            f = Math.pow(Math.sin(i),2)-Math.cos(2*i);
            result = result + i + " " + f + "\n";
        }
        System.out.println(result);
    }
    public static void eight(int k){
        int[] masiv = new int[20];
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = new Random().nextInt(0,100);
        }
        int sum = 0;
        for (int i: masiv) {
            if (i%k==0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void nine(int k){
        int t = ++k;
        int newlength = 0;
        int massiv1newlength;
        int[] masiv1 = new int[new Random().nextInt(10,30)];
        for (int i = 0; i < masiv1.length; i++) {
            masiv1[i] = new Random().nextInt(0,10);
        }
        int[] masiv2 = new int[new Random().nextInt(10,30)];
        for (int i = 0; i < masiv2.length; i++) {
            masiv2[i] = new Random().nextInt(0,10);
        }
        int[] massiv3 = new int[masiv1.length + masiv2.length];
        massiv1newlength = masiv1.length-k;
        for (int i = 0; i < k; i++) {
            massiv3[i] = masiv1[i];
        }
        for (int y = 0; y < masiv2.length; y++) {
            massiv3[t] = masiv2[y];
            t++;
        }
        for (int i = 0; i < massiv1newlength; i++) {
            massiv3[newlength] = masiv1[k++];
            ++newlength;
        }
        // System.out.println("первый");
        // for (int i = 0; i < masiv1.length; i++) {
        //     System.out.print(masiv1[i]);
        // }
        // System.out.println("второй");
        // for (int i = 0; i < masiv2.length; i++) {
        //     System.out.print(masiv2[i]);
        // }
        // System.out.println("третий");
        // for (int i = 0; i < massiv3.length; i++) {
        //     System.out.print(massiv3[i]);
        // }



    }
}
