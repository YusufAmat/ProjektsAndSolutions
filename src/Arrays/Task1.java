package Arrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //TODO  Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
        // ve bu sayıları ekrana yazan programı yazın.
        // 5 10 25 45 50 ; max 50 min 5

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi adedini giriniz : ");
        int sayiAdedi = scanner.nextInt();
        int [] sayilar = new int[sayiAdedi];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(i + 1 + ". Sayi : ");
            sayilar[i] = scanner.nextInt();
        }
        int minSayi = sayilar[0];
        int maxSayi = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > maxSayi){
                maxSayi=sayilar[i];
            }
            if (sayilar[i] < minSayi){
                minSayi=sayilar[i];
            }
        }
        System.out.println("En buyuk sayi = " +maxSayi);
        System.out.println("En kucuk sayi = "+minSayi);
    }
}
