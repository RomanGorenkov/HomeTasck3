package com.company;

public class Main {

    public static void main(String[] args) {
        Task2 task = new Task2();
        Task1 task1 = new Task1();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        /*System.out.println(task.task2_1());
        System.out.println(task.task2_2());
        System.out.println(task.task2_3(Skaner.skan));
        task.task2_4();*/
        //System.out.println(task.task2_3(Skaner.skan));
        //task1.revers(args);
        //task1.cal();
        //task1.hello(Skaner.skan);
        //task3.chetnost();
        //task3.chisla();
        //task3.fac(Skaner.skan);
        //task4.stepeni(Skaner.skan);
        //task4.lineika(task4.zerkalo(Skaner.skan)); 2
        //task4.sumKratnih(Skaner.skan);
        task5.buble(task5.input(Skaner.skan));
    }
}
