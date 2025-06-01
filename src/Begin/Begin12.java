package Begin;

import java.util.Scanner;
public class Begin12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите катет a: ");
        double a1 = sc.nextDouble();
        System.out.print("Введите катет b: ");
        double b2 = sc.nextDouble();
        double c = Math.sqrt(a1 * a1 + b2 * b2);
        System.out.println("Гипотенуза= " + c);
        System.out.println("Периметр= " + (a1 + b2 + c));
    }
}