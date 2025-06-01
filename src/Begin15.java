import java.util.Scanner;
public class Begin15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Введите площадь круга S: ");
        double s = sc.nextDouble();
        double r = Math.sqrt(s / PI);
        double d2= 2 * r;
        double l = 2 * PI * r;
        System.out.println("Диаметр круга= " + d2);
        System.out.println("Длина окружности= " + l);
    }
}