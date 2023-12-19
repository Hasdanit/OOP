package Week3;

import java.util.Scanner;

public class Week3_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b = 1, d = 1, u = 0;
        for (double i = 1; i <= 10; i++) {
            double x = scanner.nextDouble();
            u = u + Math.pow(x, i);
        }
        System.out.println(u);
    }
}


