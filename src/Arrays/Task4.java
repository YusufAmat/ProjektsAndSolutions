package Arrays;

public class Task4 {
    public static void main(String[] args) {
        //Write some Java code that stores the numbers 11 - 20 (inclusive) in an array,
        //add them up, print the total and find average of these numbers.

        int [] numList = new int[10];
        double sum = 0;
        for (int i = 0; i < numList.length; i++) {
            numList[i] = i+11;
            sum += numList[i];
        }
        System.out.printf("Avarage = %5.2f\n" , sum / numList.length);
    }
}
