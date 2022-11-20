package oOP.Task3;

public class MainApp {
    public static void main(String[] args) {

        Ogrenci ogrenci1= new Ogrenci("Ahmet", "Dursun", "Insaaat", 25);
        System.out.println(ogrenci1);

        ogrenci1.isimDegistir("Saba", "Gitsin", "Makina", 22);
        System.out.println(ogrenci1);

        ogrenci1.soyadDegistir("Gitmesin");
        System.out.println(ogrenci1);

    }
}

