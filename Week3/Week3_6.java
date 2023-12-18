package Week3;

import java.util.Scanner;
public class Week3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a % 100;
        int c = a % 4;
        int d = a % 400;
        if((c == 0 && b!=0) || (c == 0 && b == 0 && d == 0)){
            System.out.println(366);
        }
        else{
            System.out.println(365);
        }


    }
}