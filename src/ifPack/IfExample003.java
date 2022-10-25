package ifPack;

import java.util.Scanner;

public class IfExample003 {
    //        TODO 3 Bir at çiftliğinde, 10 yaş altindaki tüm çocukların ata binmesine izin verilir.
    //         10 yaş ve üstündeki çocuklar ise yalnızca 120 cm'den uzun olmaları durumunda ata binebilirler.
    //         Kullanıcıya yaşını soran ve at sürüşüne izin verilip verilmediğini gösteren bir kod yazın.
    //         Not: Kodunuzun bir karar vermesi için gerekliyse ancak kullanıcıdan boyunu sormalısınız.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yasinizi giriniz : ");
        int yas = scanner.nextInt();
        int boy = 0;

        if (yas < 10){
            System.out.println("Yasiniz kucuk oldugu icin ata binemezsiniz");
        }else if (yas>=10){
            System.out.println("Lütfen boyunuzu  cm olarak giriniz : ");
            boy = scanner.nextInt();
            if (boy>120){
                System.out.println("Ata binebilirsiniz");
            }else {
                System.out.println("boyunuz kisa oldugu icin ata binemezsniz");
            }
        }

    }
}
