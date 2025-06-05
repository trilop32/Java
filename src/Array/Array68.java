package Array;
import java.util.Scanner;
public class Array68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Размер массива должен быть положительным.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив: " + java.util.Arrays.toString(arr));
        if (arr == null || arr.length == 0) {
            return;
        }
        int minI = 0;
        int maxI = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minI]) {
                minI = i;
            }
            if (arr[i] > arr[maxI]) {
                maxI = i;
            }
        }
        if (minI != maxI) {
            int temp = arr[minI];
            arr[minI] = arr[maxI];
            arr[maxI] = temp;
        }
        System.out.println("Измененный массив: " + java.util.Arrays.toString(arr));
    }
}
