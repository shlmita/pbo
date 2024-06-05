package Pertemuan9;

public class Main {
    public static void main(String[] args) {
        //overloading contructor
        BangunDatar sisi = new BangunDatar(2);
        sisi.show();

        //overloading method
        int persegi = BangunDatar.hitung(10, 5);
        System.out.println("Luas Persegi = " + persegi);

        int panjang = BangunDatar.hitung2(5, 15);
        System.out.println("Luas Panjang = " + panjang);
        
        int segi3 = BangunDatar.hitung1(4, 3);
        System.out.println("Luas Segitiga = " + segi3);

        double lingkaran = BangunDatar.hitung(3.14, 5);
        System.out.println("Luas Lingkaran= " + lingkaran);
    }
}


