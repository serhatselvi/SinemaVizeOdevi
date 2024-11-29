package sinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Musteri> musteriler = new ArrayList<>();
        ArrayList<Film> filmler = new ArrayList<>();
        ArrayList<Salon> salonlar = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1- Yeni Müşteri Ekle");
            System.out.println("2- Yeni Film Ekle");
            System.out.println("3- Yeni Salon Ekle");
            System.out.println("4- Filmleri Listele");
            System.out.println("5- Salon Müşteri Listesi");
            System.out.println("6- Müşteri Film Kaydı Yap");
            System.out.println("7- Bir Filmin Müşteri Listesi");
            System.out.println("8- Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    // Yeni müşteri ekleme
                    System.out.print("Müşteri Adı: ");
                    String musteriAdi = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefon: ");
                    String telefon = scanner.nextLine();
                    Musteri musteri = new Musteri(musteriler.size() + 1, musteriAdi, email, telefon);
                    musteriler.add(musteri);
                    musteri.KayitEkle();
                    break;

                case 2:
                    // Yeni film ekleme
                    System.out.print("Film Adı: ");
                    String filmAdi = scanner.nextLine();
                    System.out.print("Süresi (dakika): ");
                    int suresi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Türü: ");
                    String turu = scanner.nextLine();
                    Film film = new Film(filmAdi, suresi, turu);

                    // Film için uygun salonları kontrol et
                    ArrayList<Salon> uygunSalonlar = new ArrayList<>();
                    for (Salon salon : salonlar) {
                        if (salon.getFilm() == null) { // Eğer salon başka bir filme bağlı değilse
                            uygunSalonlar.add(salon);
                        }
                    }

                    if (uygunSalonlar.isEmpty()) {
                        System.out.println("Bu film için uygun salon yok, film kaydedilemiyor.");
                    } else {
                        // Salon seçme işlemi
                        System.out.println("Uygun salonlar:");
                        for (int i = 0; i < uygunSalonlar.size(); i++) {
                            System.out.println((i + 1) + ". " + uygunSalonlar.get(i).getAdi());
                        }

                        Salon secilenSalon = null;
                        boolean salonSecildi = false;

                        // Kullanıcı doğru salonu seçene kadar tekrar sor
                        while (!salonSecildi) {
                            System.out.print("Bir salon seçin: ");
                            int salonSecim = scanner.nextInt();
                            scanner.nextLine();
                            if (salonSecim >= 1 && salonSecim <= uygunSalonlar.size()) {
                                secilenSalon = uygunSalonlar.get(salonSecim - 1);
                                salonSecildi = true;
                            } else {
                                System.out.println("Geçersiz seçim! Lütfen geçerli bir salon seçin.");
                            }
                        }

                        // Seçilen salonu filme ekle
                        if (film.SalonEkle(secilenSalon)) {
                            filmler.add(film);
                            film.KayitEkle();
                        }
                    }
                    break;

                case 3:
                    // Yeni salon ekleme
                    System.out.print("Salon Adı: ");
                    String salonAdi = scanner.nextLine();
                    System.out.print("Kapasite: ");
                    int kapasite = scanner.nextInt();
                    scanner.nextLine();
                    Salon salon = new Salon(salonlar.size() + 1, salonAdi, kapasite);
                    salonlar.add(salon);
                    salon.KayitEkle();
                    break;

                case 4:
                    // Filmleri listeleme
                    System.out.println("Filmler:");
                    for (Film f : filmler) {
                        f.Listele();
                    }
                    break;

                case 5:
                    // Salon ve müşteri listesini görüntüleme
                    System.out.println("Salonlar:");
                    for (Salon s : salonlar) {
                        s.Listele();
                        s.ListeleMusteriler();
                    }
                    break;

                 // Main.java
                case 6:
                    System.out.println("Müşteriler:");
                    for (int i = 0; i < musteriler.size(); i++) {
                        System.out.println((i + 1) + "- " + musteriler.get(i).getAdi());
                    }
                    System.out.print("Bir müşteri seçin: ");
                    int musteriSecim = scanner.nextInt();
                    scanner.nextLine();
                    Musteri secilenMusteri = musteriler.get(musteriSecim - 1);

                    System.out.println("Filmler:");
                    for (int i = 0; i < filmler.size(); i++) {
                        System.out.println((i + 1) + "- " + filmler.get(i).getAdi());
                    }
                    System.out.print("Bir film seçin: ");
                    int filmSecim = scanner.nextInt();
                    scanner.nextLine();
                    Film secilenFilm = filmler.get(filmSecim - 1);

                    // Film seçimi sonrası salonları göstereceğiz
                    ArrayList<Salon> uygunSalonlar2 = secilenFilm.getSalonlar();
                    if (uygunSalonlar2.isEmpty()) {
                        System.out.println("Bu film için uygun salon bulunmamaktadır.");
                    } else {
                        System.out.println("Uygun salonlar:");
                        for (Salon s : uygunSalonlar2) {
                            System.out.println(s.getAdi());
                        }

                        Salon secilenSalon2 = null;
                        boolean salonSecildi2 = false;

                        // Kullanıcı geçerli salonu seçene kadar döngü devam eder
                        while (!salonSecildi2) {
                            System.out.print("Bir salon seçin: ");
                            String salonSecim2 = scanner.nextLine();
                            for (Salon salon3 : uygunSalonlar2) {
                                if (salon3.getAdi().equals(salonSecim2)) {
                                    secilenSalon2 = salon3;
                                    salonSecildi2 = true;
                                    break;
                                }
                            }

                            if (!salonSecildi2) {
                                System.out.println("Geçersiz seçim! Lütfen geçerli bir salon seçin.");
                            }
                        }

                     // Film ve salon seçimi sonrası müşteri kaydetme
                        if (secilenSalon2 != null) {
                            // Salonun kapasitesini kontrol et
                            if (!secilenSalon2.salonunKapasitesiDoldu()) {
                                // Kapasite dolmamışsa müşteri kaydını yap
                                secilenSalon2.MusteriEkle(secilenMusteri);
                            } else {
                                // Kapasite dolmuşsa kullanıcıya mesaj ver
                                System.out.println("Bu salonun kapasitesi dolmuş, müşteri kaydedilemez.");
                            }
                        }

                    }
                    break;

                case 7:
                    // Filmdeki müşteri listesini gösterme
                    System.out.println("Filme ait müşteri listesi:");
                    for (int i = 0; i < filmler.size(); i++) {
                        System.out.println((i + 1) + "- " + filmler.get(i).getAdi());
                    }
                    System.out.print("Bir film seçin: ");
                    int filmSecimMusteriListesi = scanner.nextInt();
                    scanner.nextLine();
                    Film secilenFilmMusteriListesi = filmler.get(filmSecimMusteriListesi - 1);
                    secilenFilmMusteriListesi.MusterileriListele();
                    break;

                case 8:
                    System.exit(0);
                    break;
            }
        }
    }
}
