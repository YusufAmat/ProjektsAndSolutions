package forLoop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // TODO 1 Write some code that asks the user how many slices of pizza they want.
        //  Your program must print the word PIZZA the required number of times.

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many slices do you want : ");
        int slice = scanner.nextInt();
        for (int i = 0; i < slice; i++) {
            System.out.println("Pizza");
        }

        //TODO 2 Write some code that counts down from 10 to 1, and then prints the words Blast Off!
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Blast Off");


        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ "\t" + Math.pow(i,2));
        }
    }
}
