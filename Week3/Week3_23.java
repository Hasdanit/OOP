package Week3;

import java.util.Scanner;

public class Week3_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double b = 1, d = 1, u = x*x;
        for (double i = 256; i > 1; i /= 2) {
            u = (x*x + i /u);
        }
        System.out.println(x/u);
    }
}


