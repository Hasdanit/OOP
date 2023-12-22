package Contester.Week3;

import java.util.Scanner;

public class Week3_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double b = 1, d = 1, u = 1;
        for (int i = 2; i <= 64; i*=2) {
            u = u * (x - i);
            d = d * (x - i + 1);
        }
        System.out.println(u/d);
    }
}


