package strings;

import java.util.Scanner;

public class StringbufferReverse {
    public static void main(String[] args) {
        System.out.println("bir sayi giriniz : ");
        StringBuffer str = new StringBuffer(new Scanner(System.in).nextLine());
        System.out.println(str.reverse());
    }
}
