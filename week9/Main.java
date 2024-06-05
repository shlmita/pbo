package week9;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("======= BANGUN DATAR =======");
        
        BangunDatar persegi = new BangunDatar(5);
        persegi.persegi();

        BangunDatar pPanjang = new BangunDatar(5, 2);
        pPanjang.pPanjang();

        BangunDatar lingkaran = new BangunDatar();
        lingkaran.setDiameter(10);
        lingkaran.lingkaran();

        System.out.println("======= BANGUN RUANG =======");        

        BangunRuang balok = new BangunRuang(10, 5, 400);
        balok.Balok();

        BangunRuang kubus = new BangunRuang(6);
        kubus.Kubus();
    }
}