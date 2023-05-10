package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hikmet Nuri Melemen
 * Soru: Java ile kullanıcıların manavdan almış oldukları ürünlerin
 * kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
 * Meyveler ve KG Fiyatları
 * Armut : 2,14 TL
 * Elma : 3,67 TL
 * Muz: 0,95 TL
 * Patlıcan : 5,00 TL
 */

public class Greengrocer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Kilo Armut İstersin");
        int armutKilo = scanner.nextInt();
        double armutFiyat = 2.17;
        double armutToplamFiyat = armutKilo * armutFiyat;
        System.out.println("Armutun Kilosu: " + armutFiyat + " Toplam Armut Ücreti: " + armutToplamFiyat);

        System.out.println("Kaç Kilo Elma İstersin");
        int elmaKilo = scanner.nextInt();
        double elmaFiyat = 3.67;
        double elmaToplamFiyat = elmaKilo * elmaFiyat;
        System.out.println("Elma Kilosu: " + elmaFiyat + " Toplam Elma Ücreti: " + elmaToplamFiyat);

        System.out.println("Kaç Kilo Muz İstersin");
        int muzKilo = scanner.nextInt();
        double muzFiyat = 0.95;
        double muzToplamFiyat = muzKilo * muzFiyat;
        System.out.println("Muzun Kilosu: " + muzFiyat + " Toplam Muz Ücreti: " + muzToplamFiyat);

        System.out.println("Kaç Kilo Patlıcan İstersin");
        int patlicanKilo = scanner.nextInt();
        double patlicanFiyat = 0.95;
        double patlicanToplamFiyat = patlicanKilo * patlicanFiyat;
        System.out.println("Patlıcan Kilosu: " + patlicanFiyat + " Toplam Patlıcan Ücreti: " + patlicanToplamFiyat);
        double kasaTutari = armutToplamFiyat + elmaToplamFiyat + muzToplamFiyat + patlicanFiyat;
        System.out.println("Kasaya Ödenecek Toplam Tutar: " + kasaTutari);


    }
}
