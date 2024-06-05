package coba1;

public class Main {
    public static void main(String[] args) {
        //overloading pada constructor
        Buah buah1 = new Buah("Anggur");
        Buah buah2 = new Buah();
        Buah buah3 = new Buah();
        Buah buah4 = new Buah("Apel");


        buah1.show();
        buah2.show();
        buah3.show();
        buah4.show();


        //overloading method
        int a = Matematika.tambah(1, 4);
        System.out.println(a);
        
        double b = Matematika.tambah(1, 3.9);
        System.out.println(b);
    }
}
