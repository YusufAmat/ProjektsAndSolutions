package whileLoop;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Task : Bir sayının basamak sayılarının toplamını hesaplayan program yazınız. (while ile yapınız.)

        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        System.out.print("Sayiyi giriniz : ");
        int sayi = new Scanner(System.in).nextInt();
        int toplam = 0;
        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Basamak sayilarinin toplami = " + toplam);
    }
}
