package oOP.entryBlog;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.print("Kullanici adini giriniz : ");
        String username= new Scanner(System.in).nextLine();
        System.out.print("Metni  giriniz : ");
        String text= new Scanner(System.in).nextLine();
        System.out.print("Tarihi giriniz (gün. ay. yil) : ");
        String date= new Scanner(System.in).nextLine();

        EntryBlog blog = new EntryBlog(username,text,date);
        blog.displayEntry();
        System.out.println(blog.getSummary());
    }
}
