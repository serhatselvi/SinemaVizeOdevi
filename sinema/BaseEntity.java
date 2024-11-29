package sinema;

public abstract class BaseEntity {
    private int id;

    public BaseEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Bu metod her alt sınıf tarafından implement edilmek zorunda
    public abstract void BilgiGoster();

    // Bu metod her alt sınıf tarafından implement edilmek zorunda
    public abstract void KayitEkle();

    // Bu metod her alt sınıf tarafından implement edilmek zorunda
    public abstract void Listele();
}
