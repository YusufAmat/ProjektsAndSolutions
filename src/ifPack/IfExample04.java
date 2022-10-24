package ifPack;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfExample04 {
    //TODO : read tasks.txt

    public static void main(String[] args) {
        String userName = "tester";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Username : ");
        String kullaniciAdi = scanner.nextLine();
        System.out.print("Password : ");
        String sifre = scanner.nextLine();
        String yanit = "";
        String yeniSifre = "";

        if (kullaniciAdi.equals(userName) & sifre.equals(password)) {
            System.out.println("Sisteme basarili bir sekilde giris yapildi...");
        }

        if (!(kullaniciAdi.equals(userName))) {
            System.out.println("Sistemde kayitli degilsiniz.");
        } else if (!(sifre.equals(password))) {
            System.out.println("Parolaniz yanlis. Sifrenizi sifirlamak ister misiniz? ");
            System.out.print("Evet ise E, Hayir ise H tusuna basiniz : ");
            yanit = scanner.nextLine();
            if (yanit.equals("E")) {
                System.out.print("Lütfen yeni sifrenizi giriniz :");
                yeniSifre = scanner.nextLine();
                if (!(yeniSifre.equals(password))) {
                    System.out.println("Sifre olusturuldu");
                    password = yeniSifre;
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            } else {
                System.out.println("Parola sifirlama islemi durduruldu");
            }
        }
    }
}
