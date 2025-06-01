package Begin;

import java.util.Scanner;
public class Begin13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Введите радиус: ");
        double R1 = sc.nextDouble();
        System.out.print("Введите радиус: ");
        double R2 = sc.nextDouble();
        System.out.println("Площадь первого круга= " + PI * R1 * R1);
        System.out.println("Площадь второго круга= " + PI * R2 * R2);
        System.out.println("Площадь кольца= " + ((PI * R1 * R1)-(PI * R2 * R2)));
    }
}