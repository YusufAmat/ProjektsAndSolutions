package strings;


public class Split {
    public static void main(String[] args) {
       /* Aşağıdaki cümleyi split metotu ile 1-for each 2-while kullanarak kelimelere ayıralım;
        İsim Meslek Yaş başlıkları halinda tablo şeklinde listeleyelim.
        Çıktı:
        İsim    Meslek    Yaş
        Ahmet    Berber    32
        Arif    Manav    55
        Selim    Doktor    42

        String str = "Ahmet:Berber;32,Arif:Manav;55,Selim:Doktor;42";*/

        System.out.println("Isim\tMeslek\tYas");
        System.out.println("-".repeat(20));

        String str = "Ahmet:Berber;32,Arif:Manav;55,Selim:Doktor;42";
        /*String [] kisiler = str.split(",");

        String [] str1 = kisiler[0].split(";");
        String [] str2 = str1[0].split(":");

        System.out.println(str2[0] + "\t" + str2[1] + "\t" + str1[1]);

        String [] str3 = kisiler[1].split(";");
        String [] str4 = str3[0].split(":");

        System.out.println(str4[0] + "\t" + str4[1] + "\t" + str3[1]);

        String [] str5 = kisiler[2].split(";");
        String [] str6 = str5[0].split(":");

        System.out.println(str6[0] + "\t" + str6[1] + "\t" + str5[1]);*/

        //Ikinci yöntem
        str = str.replaceAll(":", ",");
        str = str.replaceAll(";", ",");
        String[] parcalar = str.split(",");
        for (int i = 0; i < parcalar.length; i += 3) {
            System.out.println(parcalar[i] + "\t" + parcalar[i + 1] + "\t" + parcalar[i + 2] + "\t");
        }
    }
}
