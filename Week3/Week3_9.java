package Week3;

import java.util.Scanner;
public class Week3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((b == 1 && a == 31) || ((b == 2 && a == 29 && ((c % 4 == 0 && c % 100 != 0) || (c % 400 == 0))) || (b == 2 && a == 28 && ((c%4!=0) || (c%4==0 && c%100==0)))) || (b == 3 && a == 31) || (b == 4 && a == 30) || (b == 5 && a == 31) || (b == 6 && a == 30) || (b == 7 && a == 31) || (b == 8 && a == 31) || (b == 9 && a == 30) || (b == 10 && a == 31) || (b == 11 && a == 30) || (b == 12 && a == 31)) {
            if (b == 12) {
                System.out.println(1 + " " + 1 + " " + c+1);
            }
            else {
                System.out.println(1 + " " + b+1 + " " + c);
            }
        }
        else {
            System.out.println((a+1) + " " + b + " " + c);
        }
    }
}