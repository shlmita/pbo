package week9;

public class BangunRuang extends BangunDatar
{
    private int tinggi;
    private int rusuk;

    public BangunRuang(int panjang, int lebar, int tinggi)
    {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public BangunRuang(int rusuk)
    {
        this.rusuk = rusuk;
    }

    public int volumeBalok()
    {
        return this.tinggi*super.getPanjang()*super.getLebar();
    }

    public int getRusuk() {
        return this.rusuk;
    }

    public int volumeKubus() {
        return getRusuk() * getRusuk() * getRusuk();
    }

    public void Balok()
    {
        System.out.println("Nama: Balok");
        System.out.println("Panjang: " + super.getPanjang());
        System.out.println("Lebar: " + super.getLebar());
        System.out.println("Tinggi: " + this.tinggi);
        System.out.println("Volume: " + volumeBalok()+ "\n");
    }

    public void Kubus()
    {
        System.out.println("Nama: Kubus");
        System.out.println("Rusuk: " + this.rusuk);
        System.out.println("Volume: " + volumeKubus()+ "\n");
    }
}