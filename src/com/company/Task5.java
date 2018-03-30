package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {

    public int[] input(Scanner skan){
        System.out.print("Введите число целых чисел: ");
        int n = skan.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i<numbers.length; i++){
            System.out.print("Введите " + (i+1) + " число: ");
            numbers[i] = skan.nextInt();
            System.out.println();
        }
        return numbers;
    }
    public void chetNechet(int[] numbers){
        for (int a: numbers) {
            if(a % 2 == 0){
                System.out.println(a + " - четное");
            }
            else {
                System.out.println(a + " - нечетное");
            }
        }
    }
    public void minMax(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];
        for (int a : numbers){
            if (a < min){
                min = a;
            }
            if(a > max){
                max = a;
            }
        }
        System.out.println("Mix - "+min+"\nMax - "+max);
    }
    public void na3ili9(int[] numbers){
        System.out.println("Числа делящиесе на 3 или 9");
        for (int a: numbers) {
            if(a%3==0 || a%9 == 0){
                System.out.println(a);
            }
        }
    }
    public void na5i7(int[] numbers){
        System.out.println("Числа делящиесе на 5 и 7");
        for (int a: numbers) {
            if(a%5==0 && a%7 == 0){
                System.out.println(a);
            }
        }
    }
    public void buble(int[] numbers){
        int max = numbers[0];
        for (int a : numbers){
            if (a<max){
                System.out.println(a);
                max=a;
            }
        }
    }
    public void raznie(int[] numbers){
        List <Integer> trex = new ArrayList();
        for(int a: numbers){
            if(a/100<10 && a/100>1){
                trex.add(a);
            }
        }
        int[][] cifri = new int[trex.size()][3];
        int def = 100;
        for(int i = 0;i<trex.size();i++){
            for (int j = 0; j < 3 ;j++){
                //cifri[i][j]=   trex[i];
            }
        }


    }
}
