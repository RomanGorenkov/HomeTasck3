package com.company;

import java.util.Scanner;

public class Task4 {
    public void stepeni(Scanner scan){
        System.out.print("Введите число: ");
        int n = scan.nextInt();
        for (int i = 0; i<4;i++){
            System.out.println(i+1 + "ая степень чистала " + n +": " +(int) Math.pow(n,i+1));
        }
    } //1
    public void lineika(boolean answer){
        if(answer){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    } // 2

    public boolean summadvuh(Scanner skan){
        System.out.print("Введите 4рехзначное число: ");
        int num = skan.nextInt();
        int nachalo = num / 100;
        int konec = num % 100;
        if(this.sum2znach(nachalo) == this.sum2znach(konec)){
            return true;
        }
        else {
            return false;
        }

    } //2.1
    protected int sum2znach(int a){
        a = a/10 + a%10;
        return a;
    }
    public boolean chetnaySumma3h(Scanner skan){
        System.out.print("Введите 3рехзначное число: ");
        int num = skan.nextInt();
        int sum = num/100 + this.sum2znach(num%100);
        if (sum%2 == 0){
            return true;
        }
        else {
            return false;
        }
    } // 2.2
    public boolean celoe2hznach(Scanner skan){
        System.out.print("Введите число: ");
        int num = skan.nextInt();
        if(num/100 != 0){
            return false;
        }
        else {
            if (num%2 == 0){
                return true;
            }
            else {
                return false;
            }
        }
    } // 2.3
    public boolean troikaPifagore(Scanner skan){
        System.out.print("Введите первое число: ");
        int a = skan.nextInt();
        System.out.print("Введите второе число: ");
        int b = skan.nextInt();
        System.out.print("Введите третье число: ");
        int c = skan.nextInt();
        if (Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)){
            return true;
        }
        else {
            return false;
        }
    } // 2.4
    public boolean razlichiay(Scanner skan){
        System.out.print("Введите 4рехзначное число: ");
        int num = skan.nextInt();
        int[] chisla = new int[4];
        int stak = 1000;
        for(int i = 0; i<4;i++){
            chisla[i] = num/stak%10;
            stak/=10;
        }
        for (int i = 0; i<chisla.length;i++){
            if(i != 3 && chisla[i] == chisla[i+1]){
                return false;
            }
        }
        return true;
    } // 2.5
    public boolean zerkalo(Scanner skan){
        System.out.print("Введите 4рехзначное число: ");
        int num = skan.nextInt();
        int[] chisla = new int[4];
        int stak = 1000;
        for(int i = 0; i<4;i++){
            chisla[i] = num/stak%10;
            stak/=10;
        }
        if(chisla[0] == chisla[3] && chisla[1] == chisla[2]){
            return true;
        }
        else {
            return false;
        }
    } // 2.6
    public void sumKratnih(Scanner skan){
        System.out.print("Введите разрядность числа(1 <= n <= 4): ");
        int n = skan.nextInt();
        System.out.print("Ведите общий делитель: ");
        int k = skan.nextInt();
        int def = 1;
        for(int i = 0;i<n;i++){
            def*=10;
        }
        int num = 0;
        while (num/def<1){
            if(num%k == 0){
                System.out.println(num);
            }
            num++;
        }
    } // 6
}
