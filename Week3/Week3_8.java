package Week3;

import java.util.Scanner;
public class Week3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println((1-a-a/4+a/100-a/400)% 7 + 7);
    }
}



