package whileLoop;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Task 1: You have to design a code such that the user has only three tries to guess
        // the correct pin of his/her account. You set the pin as a constant with a final attribute.
        //When correct display “Correct, welcome back.” When incorrect display “Incorrect, try again.”.
        //When ran out of tries display “Sorry, but you have been locked out.”
        final int userPin = 1234;
        Scanner input = new Scanner(System.in);
        int count = 3;

        while (count != 0) {
            System.out.println("Lütfen 4 haneli pin kodunuzu giriniz.");
            int enterPin = input.nextInt();
            if (enterPin == userPin) {
                System.out.println("Merhaba, Hoşgeldiniz!");
                break;
            } else if (count > 1) {
                System.out.printf("Yanlış girdiniz Son %d hakkınız kaldı.", (count - 1));

            } else {
                System.out.println("Özür dileriz, hesabınız kapatıldı!");
            }
            count--;
        }

        /*
        Scanner scanner = new Scanner(System.in);
        final String pin = "123456789";
        int count = 2;
        System.out.print("Password : ");
        String password = scanner.nextLine();
        if (password.equals(pin)) {
            System.out.println("Correct, welcome back.");
        }
        if (!(password.equals(pin))) {
            while (count > 0) {
                count--;
                System.out.println("Incorrect, try again.");
                System.out.printf("You have only %d trie(s)\n", count + 1);
                System.out.print("Password : ");
                password = scanner.nextLine();
                if (password.equals(pin)) {
                    System.out.println("Correct, welcome back.");
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Sorry but you have been locked out.");
            }
        }*/
    }
}
