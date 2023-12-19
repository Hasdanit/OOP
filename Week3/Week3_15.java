package Week3;

import java.util.Scanner;

public class Week3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double i = 0;
        double b = 0;
        while (i<n) {
            b += a;
            i += 1;
        }
        System.out.println(b);
    }

}
