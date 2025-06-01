import java.util.Scanner;
public class Begin9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        while(true) {
            System.out.print("Введите число a (неотрицательное): ");
            double a = sc.nextDouble();
            System.out.print("Введите число b (неотрицательное): ");
            double b = sc.nextDouble();
            if (a < 0 || b < 0) {
                System.out.println("Ошибка: числа должны быть неотрицательными.");
            } else {
                System.out.println("Среднее геометрическое чисел= " + Math.sqrt(a * b));
                break;
            }
        }

    }
}