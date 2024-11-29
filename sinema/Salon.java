package sinema;

import java.util.ArrayList;

public class Salon extends BaseEntity {
    private String adi;
    private int kapasite;
    private Film film; // Bu salonu hangi film kullanacak
    private ArrayList<Musteri> musteriler; // Bu salona kaydedilen müşterilerin listesi

    public Salon(int id, String adi, int kapasite) {
        super(id);
        this.adi = adi;
        this.kapasite = kapasite;
        this.film = null; // Başlangıçta salon herhangi bir filme bağlı değil
        this.musteriler = new ArrayList<>(); // Müşteriler listesi başta boş
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void Listele() {
        System.out.println("Salon Adı: " + adi + ", Kapasite: " + kapasite);
    }

    public void ListeleMusteriler() {
        if (film != null) {
            System.out.println("Bu salon, " + film.getAdi() + " filmine kaydedildi.");
        } else {
            System.out.println("Bu salon şu anda boş.");
        }
    }

    public void MusteriEkle(Musteri musteri) {
        // Eğer salon bir filme bağlıysa
        if (film != null) {
            // Eğer salonun kapasitesi dolmuşsa, müşteri kaydı yapılmaz
            if (salonunKapasitesiDoldu()) {
                System.out.println("Bu salonun kapasitesi doldu, müşteri kaydedilemez.");
            } else {
                // Salonun kapasitesi dolmamışsa, müşteri kaydını ekleyebiliriz
                musteriler.add(musteri);
                film.MusteriEkle(musteri); // Filme de müşteri ekleniyor
                System.out.println(musteri.getAdi() + " başarıyla " + film.getAdi() + " filmine kaydedildi.");
            }
        } else {
            System.out.println("Bu salona müşteri eklenemez, çünkü salon henüz bir filme kaydedilmedi.");
        }
    }

    // Kapasitenin dolup dolmadığını kontrol eden fonksiyon
    public boolean salonunKapasitesiDoldu() {
        // Eğer müşteri sayısı kapasiteyi aşıyorsa, kapasite dolmuş demektir
        return musteriler.size() >= kapasite;
    }

    @Override
    public void KayitEkle() {
        System.out.println("Salon kaydedildi: " + adi);
    }

    @Override
    public void BilgiGoster() {
        System.out.println("Salon Adı: " + adi);
        System.out.println("Kapasite: " + kapasite);
        if (film != null) {
            System.out.println("Bu salon, " + film.getAdi() + " filmine kaydedildi.");
        } else {
            System.out.println("Bu salon şu anda boş.");
        }
    }
}