package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hikmet Nuri Melemen
 * Soru:Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
 * Taksimetre KM başına 2.20 TL tutmaktadır.
 * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 * Taksimetre açılış ücreti 10 TL'dir.
 */

public class MileageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilin Kilometre");
        int kilometre = scanner.nextInt();
        int acilisUcreti = 10, minOdenecekTutar=20;
        double taksimetre = kilometre * 2.20;
        double tutar = taksimetre + acilisUcreti;

        if (tutar <= 20) {
            System.out.print("Kısa mesafe yolculuk yaptınız:");
            System.out.println("Yol ücretiniz: " + minOdenecekTutar);
        }
        else  System.out.println("Yol ücretiniz: " + tutar);
    }
}
