package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hikmet Nuri Melemen
 * Soru: Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
 * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
 * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
 * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */
public class Heat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sicaklik;
        while (true) {
            System.out.println("Sıcaklığı giriniz:");
            sicaklik = scanner.nextInt();
            if (sicaklik <= 5) {
                System.out.println("Kayak Yapabilirsin.");
            }
            if (sicaklik >= 5 && sicaklik <= 15) {
                System.out.println("Sinemaya Gidebilirsin.");
            }
            if (sicaklik > 15 && sicaklik <= 25) {
                System.out.println("Pikniğe Gidebilirsin.");
            }
            if (sicaklik > 25) {
                System.out.println("Yüzmeye gidebilirsin.");
            }
        }
    }
}
