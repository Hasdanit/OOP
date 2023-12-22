package Contester.Week3;

import java.util.Scanner;

public class Week3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double i = 1;
        double b = Math.sqrt(2);
        while (i<n) {
            b = Math.sqrt(b + 2);
            i += 1;
        }
        System.out.println(b);
    }

}
