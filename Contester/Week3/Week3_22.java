package Contester.Week3;

import java.util.Scanner;

public class Week3_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double b = 1, d = 1, u = 103;
        for (double i = 101; i >= 1; i -= 2) {
            u = i + 1 / u;
        }
        System.out.println(1/u);
    }
}


