package forLoop;

public class ForLoop4 {
    public static void main(String[] args) {
        //Write a program that displays sum of even and odd numbers between 1 and 100
        //excluding 100

        int tekToplam = 0;
        int ciftToplam = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                ciftToplam += i;
            } else {
                tekToplam += i;
            }
        }
        System.out.println("1 den 100 e kadar tek sayilarin toplami : " + tekToplam);
        System.out.println("1 den 100 e kadar cift sayilarin toplami : " + ciftToplam);
    }
}
