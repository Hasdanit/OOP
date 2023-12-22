package Contester.Week3;

import java.util.Scanner;
public class Week3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        if(x <= y && y <= z) {
            System.out.println(Math.abs(x)*2);
            System.out.println(Math.abs(y)*2);
            System.out.println(Math.abs(z)*2);
        }
        else{
            System.out.println(Math.abs(x));
            System.out.println(Math.abs(y));
            System.out.println(Math.abs(z));
        }
    }
}