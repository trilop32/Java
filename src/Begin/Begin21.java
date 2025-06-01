package Begin;
import java.util.Scanner;
public class Begin21 {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        double p = (a + b + c) / 2;
        double perimeter = a + b + c;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Стороны треугольника: a = "+ a +" b = "+ b + " c = "+ c);
        System.out.println("Периметр треугольника: "+ perimeter);
        System.out.println("Площадь треугольника: "+ area);
    }
}