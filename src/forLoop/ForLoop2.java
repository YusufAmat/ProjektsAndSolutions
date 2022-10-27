package forLoop;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        //TODO  Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
        // ve bu sayıları ekrana yazan programı yazın.
        // 5 10 25 45 50 ; max 50 min 5

        Scanner inp = new Scanner(System.in);
        int number, n, largestNumber = Integer.MAX_VALUE, smallestNumber = Integer.MIN_VALUE;
        System.out.print("Please enter how many numbers to enter: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Please enter " + i + ". number:");
            number = inp.nextInt();
            if (i == 1) {
                largestNumber = number;
                smallestNumber = number;
            } else {
                if (number > largestNumber) {
                    largestNumber = number;
                } else if (number < smallestNumber) {
                    smallestNumber = number;
                }
            }
        }
        System.out.println("The largest number is :" + largestNumber);
        System.out.println("The smallest number is :" + smallestNumber);
    }
}

