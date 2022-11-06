package Arrays;

import java.util.Scanner;

public class Task5AsalBulma {
    public static void main(String[] args) {
        // Find prime numbers in an array in Java
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + 1 + ". eleman : ");
            numbers[i] = new Scanner(System.in).nextInt();
        }

        int sayac = 0;
        int[] primeNumbers = new int[10];
        for (int i = 0; i < primeNumbers.length; i++) {
            if (asalMi(numbers[i])) {
                primeNumbers[sayac] = numbers[i];
                sayac++;
            }
        }
        int max = primeNumbers[0];
        int min = primeNumbers[0];
        System.out.println("Dizinin icerisinde " + sayac + " tane asal sayi bulunmaktadir.");
        for (int i = 0; i < sayac; i++) {
            if (max < primeNumbers[i]) {
                max = primeNumbers[i];
            }
            if (min > primeNumbers[i]) {
                min = primeNumbers[i];
            }
            System.out.println(i + 1 + ". Asal sayi = " + primeNumbers[i]);
        }
        if (max > 0 | min > 0) {
            System.out.println("Max asal sayi = " + max);
            System.out.println("Min asal sayi = " + min);
        }
    }

    public static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
