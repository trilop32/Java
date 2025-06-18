package l8;
import java.util.*;

public class TsAlgorithms {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Размер колекции: ");
        int n = sc.nextInt();
        System.out.println("Сортируется в момент заполнения: ");
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            while (!ts.add(r.nextInt(100)));
        }
        System.out.println(ts);
        System.out.println("Minimum: ");
        System.out.println("Maximum: ");
        System.out.println("Несортированный: ");
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(r.nextInt(100));
        }
        System.out.println(al);
        System.out.println("Minimum: " + Collections.min(al));
        System.out.println("Maximum: "+Collections.max(al));

    }
}
