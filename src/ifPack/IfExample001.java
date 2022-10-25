package ifPack;

import java.util.Scanner;

public class IfExample001 {
    public static void main(String[] args) {
        //        TODO 1: Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran
        //         programı yazın. Not: Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük
        //         ise KDV oranını %8 olarak alınız.
        //         Örnek :  100 Tl için çıktı; "KDV tutarı 18 tl _ KDV'li fiyat 118 tl"

        Scanner scanner = new Scanner(System.in);
        System.out.println("KDV Hesaplama Programi");
        System.out.println("------------------------");
        System.out.print("Tutari giriniz : ");
        int tutar = scanner.nextInt();
        if (tutar>0 & tutar<=1000){
            System.out.println("KDV tutari " + ((tutar*18)/100) + " tl " + "KDV` li fiyat " + (tutar+(tutar*18)/100) + " tl");
        }else if (tutar>1000){
            System.out.println("KDV tutari " + ((tutar*8)/100) + " tl " + "KDV` li fiyat " + (tutar+(tutar*8)/100) + " tl");
        }
    }
}
