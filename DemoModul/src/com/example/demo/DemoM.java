package com.example.demo;
import com.example.operations.Operation;
import java.util.Scanner;
public class DemoM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        long factorial = Operation.factorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
        try {
            int negativeNumber = sc.nextInt();
            long negativeFactorial = Operation.factorial(negativeNumber);
            System.out.println("Факториал числа " + negativeNumber + " равен " + negativeFactorial);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}