package oOP.Task3;

public class Ogrenci {
    private String ad;
    private String soyad;
    private String bolum;
    private int yas;
    public Ogrenci(String ad, String soyad, String bolum, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
        this.yas = yas;
    }
    public void isimDegistir(String ad, String soyad, String bolum, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
        this.yas = yas;
    }
    public void soyadDegistir(String soyad) {
        this.soyad = soyad;
    }
    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", bolum='" + bolum + '\'' +
                ", yas=" + yas +
                '}';
    }
}
