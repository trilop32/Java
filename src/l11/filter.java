package l11;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class filter {
    public static int[][] createRandomMatrix(int rows, int cols, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[] calculateRowSumsArrays(int[][] matrix) {
        int rows = matrix.length;
        int[] rowSums = new int[rows];
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
        }
        return rowSums;
    }
    public static int[] calculateRowSumsStreamsParallel(int[][] matrix) {
        return Arrays.stream(matrix)
                .parallel()
                .mapToInt(row -> Arrays.stream(row).sum())
                .toArray();
    }
    public static List<Integer> calculateRowSumsListStreamsParallel(int[][] matrix) {
        return Arrays.stream(matrix)
                .parallel()
                .map(row -> Arrays.stream(row).sum())
                .toList();
    }
    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        int[][] matrix = createRandomMatrix(m, n, 0, 100);
        System.out.println("Матрица:");
        printMatrix(matrix);
        System.out.println("\nСуммы строк (обычные массивы):");
        int[] rowSumsArrays = calculateRowSumsArrays(matrix);
        System.out.println(Arrays.toString(rowSumsArrays));
        System.out.println("\nСуммы строк (Stream API параллельно):");
        int[] rowSumsStreams = calculateRowSumsStreamsParallel(matrix);
        System.out.println(Arrays.toString(rowSumsStreams));
        System.out.println("\nСуммы строк (List и Stream API параллельно):");
        List<Integer> rowSumsListStreams = calculateRowSumsListStreamsParallel(matrix);
        System.out.println(rowSumsListStreams);
    }
}