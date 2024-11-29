package sinema;

public class Musteri extends BaseEntity {
    private String adi;
    private String email;
    private String telefon;
    private Salon salon;  // Müşterinin kayıtlı olduğu salon

    public Musteri(int id, String adi, String email, String telefon) {
        super(id);
        this.adi = adi;
        this.email = email;
        this.telefon = telefon;
        this.salon = null; // Başlangıçta salon bilgisi yok
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon; // Müşteriye salon atama işlemi
    }

    @Override
    public void KayitEkle() {
        System.out.println(adi + " kaydedildi.");
    }

    @Override
    public void BilgiGoster() {
        System.out.println("Müşteri Adı: " + adi);
        System.out.println("Email: " + email);
        System.out.println("Telefon: " + telefon);
        if (salon != null) {
            System.out.println("Salon: " + salon.getAdi());
        } else {
            System.out.println("Salon bilgisi bulunmuyor.");
        }
    }


    // Listele metodunu burada implement ediyoruz
    @Override
    public void Listele() {
        System.out.println("Müşteri Adı: " + adi);
        System.out.println("Email: " + email);
        System.out.println("Telefon: " + telefon);
        if (salon != null) {
            System.out.println("Salon: " + salon.getAdi());
        } else {
            System.out.println("Salon bilgisi bulunmuyor.");
        }
    }
}