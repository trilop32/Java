package l9;
public record Tovarecord<T, U>(T article, U price) {
    public static void main(String[] args) {
        Tovarecord<String, Integer> product1 = new Tovarecord<>("ART123", 100);
        Tovarecord<Integer, Double> product2 = new Tovarecord<>(456, 25.50);
        System.out.println(product1);
        System.out.println(product2);
    }
}