package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hikmet Nuri Melemen
 * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
 * <p>
 * Alan Formülü : π * r * r;
 * Çevre Formülü : 2 * π * r;
 * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
 * 𝜋 sayısını = 3.14 alınız.
 * Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("YarıÇap Girin");
        int r = scanner.nextInt();
        double pi = 3.14;
        double alan = pi * (r * r);
        double cevre = 2 * pi * r;
        System.out.println("Alanı: " + alan + " Çevresi: " + cevre);

        System.out.println("Merkez alanın Ölcüsünü giriniz");
        double mAlan=scanner.nextDouble();
        double dilim = (pi * (r * r) *mAlan) / 360;
        System.out.println("Merkez Alandan alınan Dilim: "+ dilim);
    }
}
