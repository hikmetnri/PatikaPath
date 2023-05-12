package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hİkmet Nuri melemen
 */
//Hesap makinesi
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Klavyeden 2 Sayı giriniz: ");
            System.out.println("Sayi 1");
            int sayi1 = scanner.nextInt();
            System.out.println("Sayi 2");
            int sayi2 = scanner.nextInt();

            System.out.println("Yapmak istediğiniz işlemi seçin");
            System.out.println("1: Toplama");
            System.out.println("2: Cıkarma");
            System.out.println("3: Çarpma");
            System.out.println("4: Bölme");
            int islem = scanner.nextInt();

            switch (islem) {
                case 1:
                    int toplam = sayi1 + sayi2;
                    System.out.println("Toplam Sonucu: " + toplam);
                    break;
                case 2:
                    int fark = sayi1 - sayi2;
                    System.out.println("fark Sonucu: " + fark);
                    break;
                case 3:
                    double carpim = sayi1 * sayi2;
                    System.out.println("Carpım Sonucu: " + carpim);
                    break;
                case 4:
                    int bolum = sayi1 / sayi2;
                    System.out.println("bölüm Sonucu: " + bolum);
                    break;

                default:
                    System.out.println("Yanlış İşlem Srçtiniz: ");
            }
            System.out.println("İşlem Bitti");
        }
    }
}
