package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hikmet Nuri Melemen
 * Soru: Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
 * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
  Formül
 * Kilo (kg) / Boy(m) * Boy(m)
 */
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu metre cinsinde girin");
        double boy= scanner.nextDouble();
        System.out.println("Kilonuzu girin");
        double kg= scanner.nextDouble();
        double kitleEnd=kg/(boy*boy);
        System.out.println("Kilonuz: "+kg+" Boyunuz: "+boy);
        System.out.println("Vücud Kitle Endenksiniz: "+kitleEnd);
    }
}
