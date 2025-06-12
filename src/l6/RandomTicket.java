package l6;

import java.security.SecureRandom;

import static java.io.IO.println;

public class RandomTicket {
    public void main() {
        int Students = 12;
        int Questions = 25;
        int q1, q2;
        // Random r = new Random();
        SecureRandom r = new SecureRandom();
        for(int i = 1; i < Students; i++) {
            q1 = r.nextInt(Questions)+ 65;
            q2 = r.nextInt(Questions)+ 65;
            println(i+") " + q1 + ", " + q2);
        }
    }
}
