import java.util.Scanner;
public class Begin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Введите число: ");
        double a = sc.nextDouble();
        System.out.println("Периметр квадрата P = " + 4 * a);
        System.out.println("Площадь квадрата S = " + a * a);
        double b = sc.nextDouble();
        System.out.println("Площадь квадрата S = " + a * b);
    }
}


