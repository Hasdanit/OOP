package Contester.Week3;

import java.util.Scanner;

public class Week3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1, b = 1;
        if (n == 0) {
            System.out.println(1);
        }
        else{
            while (i <= n) {
                b = b * i;
                i += 1;
            }
            System.out.println(b);
        }
    }

}
