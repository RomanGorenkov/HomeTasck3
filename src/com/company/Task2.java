package com.company;


import java.util.Scanner;

public class Task2 {

    public int task2_1(){
        int n = 25;
        int a = n/10;
        int b = n%10;
        return n=a+b;

    }
    public int task2_2(){
        int n = 123;
        int a = n/100;
        int b = (n-a*100)/10;
        int c = n%10;
        return a+b+c;
    }
    public  int task2_3(Scanner scan){
        System.out.print("Введите число для округления : ");
        double n = scan.nextDouble();
        System.out.print("Введите точность знаков после запятой : ");
        int steps = scan.nextInt() - 1;
        double num = stack();
        int accuration= (int) Math.pow(10,steps);
        n=n*accuration;
        n = (n%accuration) >= num ?  n/accuration +1: n/accuration;
        return (int) n;
    }
    public  void task2_4(){
    int a,b;
        a= 21;
        b= 8;
        System.out.println(a+"/"+b+"="+a/b);
        System.out.println(a+"%"+b+"="+a%b);
    }
    public double stack(){
        int b = 0;//сюдыль число
        double buf = 4;
        double num=0.5;
        for(int i = 0;i<b;i++){
            num=num/10;
            num=num+buf/10;
        }
        return num;
    }

}
