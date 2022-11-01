package strings;

import java.util.Scanner;

public class sayiyiTerstenYazdirma {
    public static void main(String[] args) {
        // Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        //For example, if the input is 12345, the output should be 54321.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number = ");
        String str = scanner.nextLine();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += "" +str.charAt(i);
        }
        System.out.println("Result = "+result);
    }
}
