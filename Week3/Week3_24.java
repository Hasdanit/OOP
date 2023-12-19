package Week3;

import java.util.Scanner;

public class Week3_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double b = 1, d = 1, u = 0;
        for (double i = 1; i <= 50; i++) {
            u = u + 1/(i*i*i);
        }
        System.out.println(u);
    }
}


