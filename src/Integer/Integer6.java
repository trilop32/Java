package Integer;
import java.util.Scanner;
public class Integer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int number = sc.nextInt();
            if (number > 9 && number < 100) {
                int tens = number / 10;
                int units = number % 10;
                System.out.println(tens);
                System.out.println(units);
                break;
            }
            else{
                System.out.println("Число не двух значное");
            }
        }
        sc.close();
    }
}
