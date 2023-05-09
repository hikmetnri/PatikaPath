package Week1.TechnicalLessons;

import java.util.Scanner;

public class PoinAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci Not ortalamasını bul. Ve Durumunu bildir");
        System.out.println("Kaç tane ders Alıyorsun");
        int dersSayisi = scanner.nextInt();
        System.out.println("Aldığınız ders sayısı: " + dersSayisi);

        System.out.println("Ders Adını gir: ");
        String dersA1 = scanner.next();
        System.out.println(dersA1 + " Ders Notunu gir:");
        int not1 = scanner.nextInt();

        System.out.println("Ders Adını gir: ");
        String dersA2 = scanner.next();
        System.out.println(dersA2 + " Ders Notunu gir:");
        int not2 = scanner.nextInt();

        System.out.println("Ders Adını gir: ");
        String dersA3 = scanner.next();
        System.out.println(dersA3 + " Ders Notunu gir:");
        int not3 = scanner.nextInt();

        System.out.println("Ders Adını gir: ");
        String dersA4 = scanner.next();
        System.out.println(dersA4 + " Ders Notunu gir:");
        int not4 = scanner.nextInt();

        System.out.println("Ders Adını gir: ");
        String dersA5 = scanner.next();
        System.out.println(dersA5 + " Ders Notunu gir:");
        int not5 = scanner.nextInt();

        int notOrt = (not1 + not2 + not3 + not4 + not4 + not5) / dersSayisi;
        System.out.println("Toplam" + dersSayisi + " dersin Ortalaması:" + notOrt);
        String durum = (notOrt == 50 ? "Geçti" : "Kaldı");
        System.out.println("Durum: " + durum);
    }
}
