package Contester.Week3;

import java.util.Scanner;

public class Week3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double i = 1;
        double b = 1;
        while (i <= n) {
            b *= (1 + ((1) / (i * i)));
            i += 1;
        }
        System.out.println(b);
    }

}
