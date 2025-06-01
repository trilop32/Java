import java.util.Scanner;
public class Begin14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Введите длину окружности L: ");
        double L = sc.nextDouble();
        double R = L / (2 * PI);
        double S = PI * R * R;
        System.out.println("Радиус= " + R);
        System.out.println("Площадь круга= " + S);
    }
}