package Contester.Week3;

import java.util.Scanner;
public class Week3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        if(x+y>z && x+z>y && z+y>x) System.out.println("YES");
        else System.out.println("NO");
    }
}