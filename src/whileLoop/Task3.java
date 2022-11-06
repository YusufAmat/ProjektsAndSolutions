package whileLoop;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Task 2: Kullanıcıdan alınan sayıyı ters hale getirecek program yazınız.
        // Örnek : 1643 => 3461 , 123 =>321

        System.out.print("Sayiyi giriniz : ");
        int sayi = new Scanner(System.in).nextInt();
        int sayi1 = sayi;
        int tersSayi=0;
        int sayac = 0;
        while (sayi>0){
            sayi/=10;
            sayac++;
        }
        while (sayi1>0){
            tersSayi+=(sayi1%10)*Math.pow(10,sayac-1);
            sayi1/=10;
            sayac--;
        }
        System.out.println("Girilen sayinin tersten yazilisi : "+tersSayi);
    }
}
