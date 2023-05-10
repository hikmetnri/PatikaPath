package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hikmet Nuri Melemen
 * Soru: Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
 * Formül: Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
 * 𝑢 = (a+b+c) / 2
 * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */

public class HypotenuseCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A Değişkenini gir");
        int a = scanner.nextInt();
        System.out.println("B Değişkenini gir");
        int b = scanner.nextInt();
        double c =Math.sqrt( (a * a) + (b * b));
        System.out.println("Hipotenüsü:"+c);
        double cevre=(a+b+c)/2;
        cevre *=2;
        System.out.println("Ücgenin Çevresi: "+cevre);
        double alan=(a*b)/2.00;
        System.out.println("Ücgenin Alanı: "+alan);
    }

}
