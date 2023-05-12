package Week1.TechnicalLessons;

import java.util.Scanner;

/**
 * @author Hikmet Nuri Melemen
 * Soru: Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 * eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
 * şifreler aynı ise ekrana "Şifre oluşturulamadı,
 * lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
public class PasswordReset {
    public static void main(String[] args) {
        String datakAdi = "patika", datasifre = "java123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adını Giriniz: ");
        String kAdi = scanner.next();
        System.out.println("Şifresini Giriniz: ");
        String sifre = scanner.next();

        if (kAdi.equals(datakAdi) && sifre.equals(datasifre)) {
            System.out.println("Giriş başarılı");
        } else {
            if (!kAdi.equals(datakAdi)) {
                System.out.println("Kullanıcı Adınız Yanlış");
            } else if (!sifre.equals(datasifre)) {
                System.out.println("Sifre Yanlış");
                System.out.println("Şifreyi Değiştirmek istiyorsanız lütfen 1'e Basınız:");
                int cevap = scanner.nextInt();

                if (cevap == 1) {
                    System.out.println("Yeni Şifre Oluşturmak İçin Şifrenizi 2 defa doğrulayın");
                    System.out.print("1.Sifre: ");
                    String yeniSifre = scanner.next();
                    System.out.print("Şifre Tekrar: ");
                    String sifreTekrar = scanner.next();
                    if (yeniSifre.equals(sifreTekrar)) {
                        System.out.println("Şifreniz artık: " + yeniSifre);
                    } else {
                        System.out.println("Şifreniz değişmedi");
                    }
                }
            }
        }
    }
}
