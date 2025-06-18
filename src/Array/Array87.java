package Array;
import java.util.Scanner;
public class Array87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        if (arraySize <= 0) {
            System.out.println("Размер массива должен быть больше 0.");
            return;
        }

        int[] arr = new int[arraySize];
        System.out.println("Введите элементы массива (кроме первого, остальные по возрастанию):");
        System.out.println("Первый элемент: ");
        arr[0] = scanner.nextInt();
        int previous = Integer.MIN_VALUE;
        for (int i = 1; i < arraySize; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            int current = scanner.nextInt();
            if (current < previous) {
                System.out.println("Ошибка: Элементы должны быть введены по возрастанию.");
                return;
            }
            arr[i] = current;
            previous = current;
        }
        System.out.println("Исходный массив: ");
        for (int element : arr) {
            System.out.println(element + " ");
        }
        if (arr == null || arr.length <= 1) {
            return;
        }
        int firstElement = arr[0];
        int i = 1;
        while (i < arr.length && arr[i] < firstElement) {
            i++;
        }
        if (i > 1) {
            for (int j = 0; j < i-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[i-1] = firstElement;
        }
        System.out.println("\nОтсортированный массив: ");
        for (int element : arr) {
            System.out.println(element + " ");
        }
    }
}