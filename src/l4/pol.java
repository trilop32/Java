import java.util.InputMismatchException;
import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);
    int number = 0;
    while (true) {
        try {
            System.out.print("Введите целое положительное число: ");
            number = sc.nextInt();
            if (number <= 0) {
                throw new Exception("Число должно быть больше 0.");
            }
            break;
        }
        catch (InputMismatchException e) {
            System.out.println("Ошибка: Введен неверный тип данных.  Пожалуйста, введите целое число.");
            sc.nextLine();
        }
        catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    System.out.println("Вы ввели число: " + number);
}
