package Week3;

import java.util.Scanner;

public class Week3_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double i = 0, b = 1, d = 0;
        if (a == 0 || n == 0) {
            System.out.println(0);
        }
        else{
            while (i < n) {
                b = b*(a+i);
                i += 1;
            }
            System.out.println(b);
        }
    }

}
