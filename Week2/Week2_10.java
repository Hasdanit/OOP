package Week2;

import java.util.Scanner;
public class Week2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println(((x - 2*y)*x)/(-2*y));
    }
}