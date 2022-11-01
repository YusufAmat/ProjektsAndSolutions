package whileLoop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Q-1 : Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean artiMi = true;
        int tekToplam = 0;
        while (artiMi){
            System.out.print("Sayi : ");
            number = scanner.nextInt();
            if (number >=0) {
                if (number%2==1){
                    tekToplam+=number;
                }
            }  else {
                System.out.println("Eksi sayi girdiniz");
                artiMi = false;
            }
        }
        System.out.println("Tek toplam = " + tekToplam);
    }
}
