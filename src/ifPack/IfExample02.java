package ifPack;

import java.util.Scanner;

public class IfExample02 {
    public static void main(String[] args) {
        //         TODO 2: Taksimetre Programı: Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran
        //          programı yazın.
        //          Taksimetre açılış ücreti 10 TL'dir.
        //          Taksimetre KM başına 2.20 TL tutmaktadır.
        //          Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Taksimetre Programi");
        System.out.println("--------------------");
        System.out.print("Gidilen mesafeyi kilometre olarak giriniz : ");
        int mesafe = scanner.nextInt();
        double hesap = 10 + mesafe*(2.2);

        if (hesap <20){
            System.out.println("Tutar : 20 tl");
        }else {
            System.out.printf("Tutar : %5.2f", hesap);
        }

    }
}
