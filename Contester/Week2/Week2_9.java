package Contester.Week2;

import java.util.Scanner;
public class Week2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("x = 0.1 : y = "+ (0.1*k+c));
        System.out.println("x = 1 : y = "+ (k+c));
        System.out.println("x = 5 : y = "+ (5*k+c));
    }
}