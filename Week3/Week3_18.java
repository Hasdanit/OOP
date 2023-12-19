package Week3;

import java.util.Scanner;

public class Week3_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double i = 1, b = 1, d = 0;
        if (a == 0 || n == 0) {
            System.out.println(0);
        }
        else{
            b = a;
            while (i <= n+1) {
                d = d + (1 / b);
                b = Math.pow(a, 2*i);
                i += 1;
            }
            System.out.println(d);
        }
    }

}
