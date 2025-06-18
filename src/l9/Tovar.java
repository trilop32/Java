package l9;
class Product<T, U extends Number> {
    private T sku;
    private U price;
    public Product(T sku, U price) {
        this.sku = sku;
        this.price = price;
    }
    public T getSku() {
        return sku;
    }
    public void setSku(T sku) {
        this.sku = sku;
    }
    public U getPrice() {
        return price;
    }
    public void setPrice(U price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "sku=" + sku +
                ", price=" + price +
                '}';
    }
}
public class Tovar {
    public static void main(String[] args) {
        Product<String, Integer> product1 = new Product<>("ART123", 100);
        System.out.println("Product 1: " + product1);
        Product<Integer, Double> product2 = new Product<>(456, 25.50);
        System.out.println("Product 2: " + product2);
        Product<String, Double> product3 = new Product<>("ITEM789", 99.99);
        System.out.println("Product 3: " + product3);
        String skuProduct1 = product1.getSku();
        Integer priceProduct1 = product1.getPrice();
        System.out.println("SKU of Product 1: " + skuProduct1);
        System.out.println("Price of Product 1: " + priceProduct1);
    }
}