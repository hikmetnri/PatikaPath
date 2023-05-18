package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hikmet Nuri Melemen
 * Burc Bulma
 */
public class FindingHoroscope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi ayda doğdun");
        int ay = scanner.nextInt();
        System.out.println("Hangi gün doğdun:");
        int gun = scanner.nextInt();
        if ((ay == 1) && (gun >= 1 && gun <= 30)) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Oğlak");
            } else {
                System.out.println("Kova");
            }

        } else if ((ay == 2) && (gun >= 1 && gun <= 29)) {
            if (gun >= 1 && gun <= 19) {
                System.out.println("Kova");
            } else {
                System.out.println("Balık");
            }
        } else if ((ay == 3) && (gun >= 1 && gun <= 31)) {
            if (gun >= 1 && gun <= 20) {
                System.out.println("Balık");
            } else {
                System.out.println("Koç");
            }
        } else if ((ay == 4) && (gun >= 1 && gun <= 30)) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Koç");
            } else {
                System.out.println("Boğa");
            }
        } else if ((ay == 5) && (gun >= 1 && gun <= 31)) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Boğa");
            } else {
                System.out.println("ikizler");
            }
        } else if ((ay == 6) && (gun >= 1 && gun <= 30)) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("İkizler");
            } else {
                System.out.println("Yengeç");
            }
        } else if ((ay == 7) && (gun >= 1 && gun <= 31)) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Yengeç");
            } else {
                System.out.println("Aslan");
            }
        } else if ((ay == 8) && (gun >= 1 && gun <= 31)) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Aslan");
            } else {
                System.out.println("Başak");
            }
        } else if ((ay == 9) && (gun >= 1 && gun <= 30)) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Başak");
            } else {
                System.out.println("Terazi");
            }
        } else if ((ay == 10) && (gun >= 1 && gun <= 31)) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Terazi");
            } else {
                System.out.println("Akrep");
            }
        } else if ((ay == 11) && (gun >= 1 && gun <= 30)) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Akrep");
            } else {
                System.out.println("Yay");
            }
        } else if ((ay == 12) && (gun >= 1 && gun <= 31)) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Yay");
            } else {
                System.out.println("Oğlak");
            }
        } else {
            System.out.println("Böyle bir ay veya gün Yok");
        }
    }
}