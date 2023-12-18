package Week3;

import java.util.Scanner;
public class Week3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        System.out.println(Math.max(x,Math.max(y,z)));
    }
}