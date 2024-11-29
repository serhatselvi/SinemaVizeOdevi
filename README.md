Sinema Yönetim Sistemi
Bu proje, bir sinemada filmler, salonlar ve müşterilerle ilgili temel işlemleri yönetmeye yönelik bir sistemdir. Kullanıcılar, filmleri ekleyebilir, salonları oluşturabilir ve müşterileri filmlerle ilişkilendirebilirler. Sistem, salon kapasitesinin kontrolü, film gösterimleri, müşteri kaydı ve salon bazında müşteri takibi gibi işlemleri sağlar.

Proje Yapısı
Projede 4 ana sınıf bulunmaktadır:

Salon: Sinema salonlarını temsil eder. Salonların adı, kapasitesi ve hangi filmi gösterdiği gibi bilgiler tutulur.
Film: Sinemadaki filmleri temsil eder. Filmin adı, süresi ve türü gibi bilgiler bulunur.
Musteri: Sinemaya gelen müşterileri temsil eder. Müşterinin adı, e-posta adresi, telefon numarası ve hangi salonda izlediği gibi bilgiler saklanır.
Main: Kullanıcı etkileşimini sağlamak için kullanılan ana sınıftır. Kullanıcı, bu sınıf aracılığıyla sistemi kullanır ve filmler, salonlar ve müşterilerle ilgili işlemler yapar.
Özellikler
Yeni Müşteri Ekleme: Kullanıcı, sisteme yeni bir müşteri ekleyebilir. Müşterinin adı, e-posta adresi ve telefon numarası girilir.
Yeni Film Ekleme: Kullanıcı, yeni bir film eklerken filmin adı, süresi ve türünü belirler. Ayrıca, filme uygun salonlar listelenir ve kullanıcı salonu seçerek filme atama yapar.
Yeni Salon Ekleme: Kullanıcı, sinemada yeni bir salon oluşturabilir. Salon adı ve kapasite gibi bilgiler belirlenir.
Salon ve Müşteri Listesi: Kullanıcı, salonları ve bu salonlara kayıtlı müşterileri listeleyebilir.
Müşteri Film Kaydı Yapma: Kullanıcı, mevcut müşterileri seçip bir film için salon belirleyerek kaydedebilir. Salonun kapasitesi dolmamışsa müşteri kaydedilebilir.
Filme Kayıtlı Müşterileri Görüntüleme: Kullanıcı, bir filme kaydolan tüm müşterileri listeleyebilir.
Kullanım
Projeyi çalıştırmak için aşağıdaki adımları takip edebilirsiniz:

Proje Dosyasını İndirin veya Kopyalayın: Projenin tüm dosyalarını bir klasöre indirin veya kopyalayın.
IDE'yi Açın: Eclipse, IntelliJ IDEA gibi bir Java IDE'si kullanarak projeyi açın.
Main.java Sınıfını Çalıştırın: Main.java sınıfını çalıştırarak terminal üzerinden kullanıcı etkileşimine başlayabilirsiniz.
Menüden Seçim Yapın: Çalışmaya başladığınızda terminalde size çeşitli seçenekler sunulacaktır. Bu seçenekleri takip ederek yeni müşteri, film, salon ekleyebilir ve işlemlerinizi gerçekleştirebilirsiniz.
---------------------------------Kullanıcı Menüsü---------------------------------
Program çalıştırıldığında aşağıdaki menü seçenekleri ile karşılaşacaksınız:
---------------------------------
1- Yeni Müşteri Ekle
2- Yeni Film Ekle
3- Yeni Salon Ekle
4- Filmleri Listele
5- Salon Müşteri Listesi
6- Müşteri Film Kaydı Yap
7- Bir Filmin Müşteri Listesi
8- Çıkış
-----------------------------------------------------------------------------------
1. Yeni Müşteri Ekle:
Müşteri adı, e-posta ve telefon bilgileri girilir ve yeni müşteri sisteme eklenir.

2. Yeni Film Ekle:
Yeni bir film eklenirken, film adı, süresi ve türü belirlenir. Ayrıca uygun salonlar listelenir ve bir salon seçilerek filme atanır.

3. Yeni Salon Ekle:
Yeni bir salon eklerken, salon adı ve kapasitesi belirlenir.

4. Filmleri Listele:
Sistemdeki mevcut filmler listelenir.

5. Salon Müşteri Listesi:
Salonlar ve bu salonlara kayıtlı müşteriler görüntülenir.

6. Müşteri Film Kaydı Yap:
Mevcut bir müşteri seçilir ve bir film ile salon seçilerek müşteri kaydedilir. Salonun kapasitesi kontrol edilir.

7. Bir Filmin Müşteri Listesi:
Bir film için kaydolan müşterilerin listesi görüntülenir.

8. Çıkış:
Programdan çıkılır.

Sınıf Açıklamaları
---------------------------------
Salon Sınıfı
Salon adı (adi), kapasitesi (kapasite) ve film bilgisi (film) ile bir salonu temsil eder.
Müşteri ekleme (MusteriEkle) ve salon bilgilerini listeleme (Listele) gibi işlemleri gerçekleştirir.
Kapasite dolarsa, yeni müşteri eklenemez.
---------------------------------
Film Sınıfı
---------------------------------
Film adı (adi), süresi (suresi) ve türü (turu) ile bir filmi temsil eder.
Film ile ilişkilendirilmiş salonlar (salonlar) ve filme kaydolan müşteriler (musteriler) vardır.
Film için uygun salon eklenebilir ve filme müşteri kaydedilebilir.
---------------------------------
Musteri Sınıfı
---------------------------------
Müşteri adı (adi), e-posta (email), telefon (telefon) gibi bilgileri tutar.
Müşteri, bir salona kaydedilebilir ve bu salon ile ilişkilendirilir.
---------------------------------
Main Sınıfı
---------------------------------
Kullanıcıdan giriş alarak sinema salonu, film ve müşteri işlemlerini yönetir.
Kullanıcıya menü seçenekleri sunarak ilgili işlemleri yapmasını sağlar.
