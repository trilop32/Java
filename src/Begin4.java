import java.util.Scanner;
public class Begin4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        //4
        System.out.println("задание 4");
        System.out.print("Введите диаметр окружности d: ");
        double d = sc.nextDouble();
        System.out.println("Длина окружности= " + PI * d);
    }
}
