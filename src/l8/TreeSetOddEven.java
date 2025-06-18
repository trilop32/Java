package l8;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetOddEven {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("treeSet Size: ");
        int n = sc.nextInt();
        System.out.println("Before: ");
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for (int i = 1; i <= n; i++) {
            while (!ts.add(rand.nextInt(100)));
        }
        System.out.println(ts);
        Iterator it;
        int x;
        it=ts.iterator();
        System.out.println("Odd numbers: ");
        while (it.hasNext()) {
            x=(int)it.next();
            if(x%2!=0){
                System.out.println(x+" ");
            }
        }
        System.out.println();
        it=ts.iterator();
        System.out.println("Even numbers: ");
    }
}
