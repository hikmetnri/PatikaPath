package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hikmet Nuri Melemen
 * Soru:Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
public class GradeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci Not ortalaması ");
        int islem = 0, toplam = 0;
        System.out.println("Matematik Notunu girin: ");
        int mat = scanner.nextInt();
        if (mat > 0 && mat <= 100) {
            islem++;
            toplam += mat;
        } else {
            System.out.println("Matematik Notunuz ortalamaya Alınmamıştır.");
        }

        System.out.println("Fizik Notunu girin: ");
        int fizik = scanner.nextInt();
        if (fizik > 0 && fizik <= 100) {
            islem++;
            toplam += fizik;
        } else {
            System.out.println("Fizik Notunuz ortalamaya Alınmamıştır.");
        }
        System.out.println("Türkçe Notunu girin: ");
        int turkce = scanner.nextInt();
        if (turkce > 0 && turkce <= 100) {
            islem++;
            toplam += turkce;
        } else {
            System.out.println("Türkçe Notunuz ortalamaya Alınmamıştır.");
        }
        System.out.println("Kimya Notunu girin: ");
        int kimya = scanner.nextInt();
        if (kimya > 0 && kimya <= 100) {
            islem++;
            toplam += kimya;
        } else {
            System.out.println("Kimya Notunuz ortalamaya Alınmamıştır.");
        }
        System.out.println("Müzik Notunu girin: ");
        int muzik = scanner.nextInt();
        if (muzik > 0 && muzik <= 100) {
            islem++;
            toplam += muzik;
        } else {
            System.out.println("Müzik Notunuz ortalamaya Alınmamıştır.");
        }

        int gno = toplam / islem;
        System.out.println("Genel not ortalaması: " + gno);
    }
}
