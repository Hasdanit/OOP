package Contester.Week3;

import java.util.Scanner;

public class Week3_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), a = scanner.nextDouble();
        int n = scanner.nextInt();
        double b = 1, d = 0, u = 1;
        for (int i = 1; i <= n; i++) {
            x = Math.pow(x + a, 2);
        }
        System.out.println(x+a);
    }
}


