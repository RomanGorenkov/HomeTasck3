package com.company;

import java.util.Scanner;

public class Task3 {
    public void chetnost(){
        int i =1;
        while (i<11){
            if(i%2==0){
                System.out.println(i+"-четное");
                i++;
            }
            else {
                System.out.println(i+"-нечетное");
                i++;
            }
        }
    }
    public void chisla(){
        int a = 1;
        int sum = 0;
        int mul = 1;
        while (sum<=200 && mul<=300){
            System.out.println(a);
            a+=3;
            sum+=a;
            mul*=a;
        }
        System.out.println("Число элементов: " + ((a-4)/3 +1));
    }
    public void fac(Scanner skan){
        System.out.print("Введите число:");
        int input = skan.nextInt();
        int def = 1;
        int fac = 1;
        while (def<=input){
            fac*=def;
            def++;
        }
        System.out.println("Фкториал числа " + input + " это " + fac);
    }
}
