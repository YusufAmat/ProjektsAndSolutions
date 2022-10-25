package ifPack2;

import java.util.Scanner;

public class ConditionalExercises {
    public static void main(String[] args) {

        //TODO 1: İki tamsayı değişkenine değerleri assign ediniz.
        // Önce bunları isimleri ve değerleriyle birlikte ekrana yzadırınız.
        // Daha sonra iki değişkenin değerlerini yer değiştirip ekrana tekrar yazdırınız.


//        int x = 15;
//        int y = 20;
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);
//        // y =15 ve x = 20
//        int temp= x; // temp =15
//        x = y ; // x = 20
//        y = temp; // y= 15
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);




        // TODO 2 : Kullanıcıdan alınan bir sayının ondalıklı olup olmadığını sorgulayacak; ondalıklı ise
        //  "Ondalık sayı, Ondalık Değeri:" şeklinde, ondalıklı değilse "Tamsayıdır" çıktısı verecek program yazınız.
        //  Örnek x=35.42 için Output(Ondalık sayı, ondalık değeri 0.42 dir), y= 45 için Output(Tamsayıdır)

//        Scanner input = new Scanner (System.in);
//        System.out.println("Bir sayı girin: ");
//        double num= input.nextDouble();
//        double result= num - (int)num;
//        if (result != 0){
//            System.out.printf("Ondalıklı sayı: %5.2f", result);
//        }else{
//            System.out.println("Tamsayı");
//        }




        // TODO 3 Write some code that asks the user for a number between 1 and 5 and prints the English word equivalent.
        //  Use switch-case for solution.
        //  Output: 1 --> ONE, 4 --> FOUR

//        Scanner input = new Scanner (System.in);
//        System.out.println("Bir sayı girin: ");
//        int num= input.nextInt();
//        switch (num) {
//            case 1:
//                System.out.println( "--> ONE");
//                break;
//            case 2:
//                System.out.println("--> TWO");
//                break;
//            case 3:
//                System.out.println("-->THREE");
//                break;
//            case 4:
//                System.out.println("-->FOUR");
//                break;
//            case 5:
//                System.out.println("-->FIVE");
//                break;
//            default:
//                System.out.println("Wrong number");
//
//        }

//        TODO 4 Haftanın bir gününü numara olarak kullanıcıdan alarak (Örnek: 1 Pazartesi .... 7 Pazar) eğer
//         cumartesi ve pazar günleri seçilmişse "Yaşasın haftasonu", diğer günler seçilmişse "Haftasonunu dört
//         gözle bekliyorum" çıktısı verecek switch case ile bir program yazın.

//        Scanner input = new Scanner (System.in);
//        System.out.println("Bir gün için sayı girin: ");
//        int day= input.nextInt();
//        switch (day) {
////            case 1:
////                System.out.println( "Haftasonunu dört gözle bekliyorum");
////                break;
////            case 2:
////                System.out.println("Haftasonunu dört gözle bekliyorum");
////                break;
////            case 3:
////                System.out.println("Haftasonunu dört gözle bekliyorum");
////                break;
////            case 4:
////                System.out.println("Haftasonunu dört gözle bekliyorum");
////                break;
////            case 5:
////                System.out.println("Haftasonunu dört gözle bekliyorum");
////                break;
//            case 6:
//                System.out.println("Yaşasın haftasonu");
//                break;
//            case 7:
//                System.out.println("Yaşasın haftasonu");
//                break;
//            default:
//                System.out.println("haftasonunu dört gözle bekliyorum.");
//        }


        // TODO 5 Kuallnıcıdan bir spor branşı alıp; eğer Futbol, Yüzme, Amerikan Futbolu ise "outdoor", Satranç,
        //  Puzzle,Jimnastik ise "indoor" değil ise " ben bu sporu bilmiyorum" yazdıracak switch case programı yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir spor branşı yazınız: ");
        String game= input.nextLine();
        switch(game){
            case "Futbol": case"Yüzme": case"Amerikan Futbolu":
                System.out.println("outdoor");
                break;
            case "Satranç": case"Puzzle": case"Jimnastik":
                System.out.println("indoor");
                break;
            default:
                System.out.println("ben bu sporu bilmiyorum");
        }
    }
}
