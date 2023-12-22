package Contester.Week3;

import java.util.Scanner;

public class Week3_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = 1, d = 0, u = 1, i = 1;
        if (a == 0) {
            System.out.println(0);
        } else {
            while (i <= 13) {
                b = b * i;
                if (i % 2 != 0 || i == 1) {
                    d = d - (Math.pow(a, i) / (b * Math.pow(-1, u)));
                    u += 1;
                }
                i += 1;
            }
            System.out.println(d);
        }
    }
}


