package Contester.Week3;

import java.util.Scanner;
public class Week3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double descreminant = y*y - 4*x*z;
        if (descreminant < 0){
            System.out.println("no solution");
        }
        else if(descreminant == 0){
            System.out.println(-y/(2*x));
        }
        else {
            System.out.println((-y + Math.sqrt(descreminant))/2*x);
            System.out.println((-y + Math.sqrt(descreminant))/2*x);
        }
    }
}