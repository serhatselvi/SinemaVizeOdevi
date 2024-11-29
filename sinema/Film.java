package sinema;

import java.util.ArrayList;

public class Film extends BaseEntity {
    private String adi;
    private int suresi;
    private String turu;
    private ArrayList<Salon> salonlar;
    private ArrayList<Musteri> musteriler;

    public Film(String adi, int suresi, String turu) {
        super(-1);
        this.adi = adi;
        this.suresi = suresi;
        this.turu = turu;
        this.salonlar = new ArrayList<>();
        this.musteriler = new ArrayList<>();
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getSuresi() {
        return suresi;
    }

    public void setSuresi(int suresi) {
        this.suresi = suresi;
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    // Salon ekleme işlemi
    public boolean SalonEkle(Salon salon) {
        if (salon.getFilm() == null) { // Eğer salon başka bir filme bağlı değilse
            salonlar.add(salon);
            salon.setFilm(this); // Salona film atama
            return true;
        }
        return false;
    }

 // Film.java
    public void MusteriEkle(Musteri musteri) {
        musteriler.add(musteri);  // Sadece müşteri ekle
    }
    
    // Müşterileri listeleme
    public void MusterileriListele() {
        if (musteriler.isEmpty()) {
            System.out.println("Bu filmde kaydolan müşteri bulunmamaktadır.");
        } else {
            System.out.println(this.adi + " filmine kayıtlı müşteriler:");
            for (Musteri m : musteriler) {
                System.out.print(m.getAdi());
                if (m.getSalon() != null) {
                    System.out.println(" - Salon: " + m.getSalon().getAdi());
                } else {
                    System.out.println(" - Salon bilgisi bulunmuyor.");
                }
            }
        }
    }

    // Film bilgilerini gösterme
    @Override
    public void BilgiGoster() {
        System.out.println("Film Adı: " + adi);
        System.out.println("Süresi: " + suresi + " dakika");
        System.out.println("Türü: " + turu);
    }

    // Film kaydını ekleme
    @Override
    public void KayitEkle() {
        System.out.println(adi + " filmi kaydedildi.");
    }

    // Film bilgilerini listeleme
    @Override
    public void Listele() {
        System.out.println("Film Adı: " + adi + ", Türü: " + turu + ", Süre: " + suresi + " dakika");
    }

    public ArrayList<Salon> getSalonlar() {
        return salonlar;
    }
}