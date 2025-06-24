package l10;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;
public class lambda {
    interface AverageFinder {
        double calculateAverage(List<Integer> numbers, int divisor);
    }
    public static List<Integer> Random(int size) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }
    public static double calc(List<Integer> numbers, int divisor) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if ((i + 1) % divisor == 0) {
                sum += numbers.get(i);
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        List<Integer> numbers = Random(size);
        System.out.println("Массив: " + numbers);
        System.out.print("Введите делитель для позиций: ");
        int divisor = scanner.nextInt();
        AverageFinder averageFinder = lambda::calc;
        double average = averageFinder.calculateAverage(numbers, divisor);
        System.out.println("Среднее арифметическое чисел на позициях, кратных " + divisor + ": " + average);
        ToDoubleFunction<List<Integer>> aFunction = list -> {
            double sum = 0;
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if ((i + 1) % divisor == 0) {
                    sum += list.get(i);
                    count++;
                }
            }
            return count == 0 ? 0 : sum / count;
        };
        double Lambda = aFunction.applyAsDouble(numbers);
        System.out.println("Среднее арифметическое (через лямбда): " + Lambda);
    }
}
