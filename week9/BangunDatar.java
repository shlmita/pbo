package week9;

public class BangunDatar
{
    private int panjang;
    private int lebar;
    private int diameter;
    private int sisi;
    private static final double pi = 3.14;

    public BangunDatar(int sisi)
    {
        this.sisi = sisi;
    }

    public BangunDatar()
    {
        this.diameter = diameter;
    }

    public BangunDatar(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setDiameter(int x)
    {
        this.diameter = x;
    }
    
    public int getDiameter()
    {
        return this.diameter;
    }

    public int getPanjang()
    {
        return this.panjang;
    }
    public int getLebar()
    {
        return this.lebar;
    }

    public int luas(int x) //persegi
    {
        return x*x;
    }

    public double luas(int x, double pi) //lingkaran
    {
        return (x*x*pi)/4;
    }

    public int luas(int x, int y) //pPanjang
    {
        return x*y;
    }

    public void persegi()
    {
        System.out.println("Nama: Persegi");
        System.out.println("Sisi: " + this.sisi);
        System.out.println("Luas: " + luas(sisi) + "\n");
    }
    
    public void pPanjang()
    {
        System.out.println("Nama: Persegi Panjang");
        System.out.println("Panjang: " + this.panjang);
        System.out.println("Lebar: " + this.lebar);
        System.out.println("Luas: " + luas(panjang, lebar) + "\n");
    }

    public void lingkaran()
    {
        System.out.println("Nama: Lingkaran");
        System.out.println("Diameter: " + getDiameter());
        System.out.println("Luas: " + luas(getDiameter(), pi) + "\n");
    }
}