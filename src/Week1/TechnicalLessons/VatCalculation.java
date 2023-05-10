package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hikmet Nuri melemen
 * Soru : Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
 * tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
public class VatCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {               //İşlem bittiğinde terar run etmemek için whilde kullandım
            System.out.println("Ücreti Giriniz: ");
            double tutar = scanner.nextDouble();
            double dusukKdvOran = 0.08;
            double yuksekKdvOran = 0.18;

            if (tutar <= 1000) {
                double kdvucreti = tutar * dusukKdvOran;
                double toplamTutar = kdvucreti + tutar;
                System.out.println("Kdvsiz Tutar: " + tutar);
                System.out.println("Kdv oranı %" + dusukKdvOran);
                System.out.println("Kdvücreti: " + kdvucreti);
                System.out.println("Toplam Tutar: " + toplamTutar);


            } else if (tutar > 1000) {
                double kdvucreti = tutar * yuksekKdvOran;
                double toplamTutar = kdvucreti + tutar;
                System.out.println("Kdvsiz Tutar: " + tutar);
                System.out.println("Kdv oranı %" + yuksekKdvOran);
                System.out.println("Kdv ücreti: " + kdvucreti);
                System.out.println("Toplam Tutar: " + toplamTutar);
            }
        }
    }
}
