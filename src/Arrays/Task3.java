package Arrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Write some Java code that asks the user how many numbers they want to store.
        //Based on their answer, you should create an integer array of the correct size.
        //Then ask the user to enter the numbers and store them in the array you created.
        //Finally, print out the contents of the array.

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to store : ");
        int size = scanner.nextInt();
        int [] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i+1 + ". number : ");
            numbers[i]= scanner.nextInt();
        }

        for (int num:numbers) {
            System.out.print(num + " ");
        }
    }
}
