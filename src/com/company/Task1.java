package com.company;


import java.util.Scanner;

public class Task1 {
    public void hello(Scanner scan){
        System.out.println("Кого встречаем?");
        String name = scan.next();
        System.out.println("Здравствуй " + name);

    }
    public void revers(String[] args){
        for(int i = args.length-1; i>=0; i--){
            System.out.println(args[i]);
        }
    }
    public void last(String[] args){
        System.out.println(args[args.length-1]);
    }
    public void cal(){
        final int c = 5;
        final int b = 7;
        System.out.println("a="+ (4*(b+c-1)/2));
    }
}
