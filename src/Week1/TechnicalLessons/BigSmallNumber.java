package Week1.TechnicalLessons;

import java.util.Scanner;

public class BigSmallNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Sayi 1 Girin:");
        a = scanner.nextInt();
        System.out.println("Sayi 2 Girin:");
        b = scanner.nextInt();
        System.out.println("Sayi 3 Girin:");
        c = scanner.nextInt();
        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a>b>c");
            } else {
                System.out.println("a>c>b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b>a>c");
            } else {
                System.out.println("b>c>a");
            }
        } else {
            if (a > b) {
                System.out.println("c>a>b");
            } else {
                System.out.println("c>b>a");
            }
        }
    }
}
