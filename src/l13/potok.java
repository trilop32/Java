package l13;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
class Account {
    private String name;
    private double balance;
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Аккаунт{" +
                "имя='" + name + '\'' +
                ", баланс=" + balance +
                '}';
    }
}
class Bank {
    private final Map<String, Account> accounts = new HashMap<>();
    private final Object lock = new Object();
    public void addAccount(Account account) {
        accounts.put(account.getName(), account);
    }
    public Account getAccount(String name) {
        return accounts.get(name);
    }
    public void changeBalance(String name, double amount) {
        synchronized (lock) {
            Account account = accounts.get(name);
            if (account != null) {
                double newBalance = account.getBalance() + amount;
                account.setBalance(newBalance);
                System.out.println(Thread.currentThread().getName() + ": Аккаунт " + name + " баланс, измененный " + amount + ". Новый баланс: " + newBalance);
            } else {
                System.out.println("Аккаунта " + name + " не найдено.");
            }
        }
    }
}
public class potok {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        bank.addAccount(new Account("Alice", 1000));
        bank.addAccount(new Account("Bob", 500));
        bank.addAccount(new Account("Charlie", 2000));
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                for (int j = 0; j < 10; j++) {
                    String[] names = {"Alice", "Bob", "Charlie"};
                    String name = names[random.nextInt(names.length)];
                    double amount = (random.nextDouble() * 200) - 100;
                    bank.changeBalance(name, amount);
                    try {
                        Thread.sleep(random.nextInt(100));
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("\nИтоговый баланс:");
        System.out.println(bank.getAccount("Alice"));
        System.out.println(bank.getAccount("Bob"));
        System.out.println(bank.getAccount("Charlie"));
    }
}