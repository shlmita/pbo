package Pertemuan9;

public class BangunDatar {
    private int sisi;
    private static final double phi = 3.14;

    BangunDatar(int sisi){
        this.sisi = sisi;
    }

    void show(){
        System.out.println("Sisi = " + this.sisi);
    }

    public static int hitung(int x, int z){
        return x*z;
    }

    public static int hitung2(int a, int b){
        return a*b;
    }

    public static int hitung1(int a, int t){
        return (a*t)/2;
    }

    public static double hitung(double phi, int r){
        return(double) phi * r * r;
    }
}







