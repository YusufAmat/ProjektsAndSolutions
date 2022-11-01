package Arrays;

public class Task2 {
    public static void main(String[] args) {
        //Write some Java code that stores the numbers from 1 to 19 in an array.
        int [] numList = new int[19];
        for (int i = 0; i < numList.length; i++) {
            numList[i] = i+1;
        }
        for (int num : numList) {
            System.out.print(num + " ");
        }
        System.out.println("\n-------------------------");


        // 2 'den 20 ye kadar çift sayıları içeren bir liste oluşturun.
        int [] evenNumList = new int[10];
        for (int i = 0; i < evenNumList.length; i++) {
            evenNumList[i] = (i+1)*2;
            System.out.print(evenNumList[i] + " ");
        }

    }
}
