package ifPack;

import java.util.Scanner;

public class IfExample005 {
    public static void main(String[] args) {
        //  A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
        //    Bilet tarifesi:
        //    km birim fiyati : 0.10$
        //    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
        //    12 ve 24 yas arasindaysa 10% indirim,
        //    65 yasindan buyukse 30% indirim,
        //    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Havayolu Sirketine Hosgeldiniz.");
        System.out.println("================================");
        System.out.println("Nereye ucmak istiyorsunuz [B, C, D] ");
        System.out.print("Secim : ");
        String hedef = scanner.nextLine().toUpperCase();
        System.out.println("Gidis dönüs mü? [Evet icin 'E', Hayir icin 'H' tusuna basiniz.");
        System.out.print("Secim : ");
        String gidisDonus = scanner.nextLine().toUpperCase();
        System.out.print("Yasiniz : ");
        int yas = scanner.nextInt();
        System.out.println("Bilet fiyatiniz hesaplaniyor...");
        System.out.println("Tutar = " + tutarHesapla(hedef, gidisDonus, yas));
    }

    public static double tutarHesapla(String hedef, String gidisDonus, int yas) {
        double tutar = 0;
        switch (hedef) {
            case "B" -> tutar = 500 * 0.10;
            case "C" -> tutar = 700 * 0.10;
            case "D" -> tutar = 900 * 0.10;
            default -> System.out.println("Yanlis secim yaptiniz.");
        }

        switch (gidisDonus) {
            case "E" -> tutar = 2 * tutar * 0.8;
            case "H" -> tutar = tutar;
            default -> System.out.println("Yanlis secim.");
        }

        if (yas < 12) {
            tutar -= tutar * 0.5;
        } else if (yas >= 12 & yas < 24) {
            tutar -= tutar * 0.1;
        } else if (yas > 65) {
            tutar -= tutar * 0.3;
        }
        return tutar;
    }
}
