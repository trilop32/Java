package Integer;
import java.util.Scanner;
public class Integer22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sec = N % 3600;
        System.out.println(sec);
        sc.close();
    }
}
