package coba1;

public class Buah {
    private String name;
    //buat keterangan tambah angkabuah 1 buah 2 buah 3
    private static int jumlahBuah;

    //Overloading contructor
    //opsi1
    Buah(String name)
    {
        Buah.jumlahBuah++;
        this.name = name;
    }

    //opsi2
    Buah()
    {
        Buah.jumlahBuah++;
        this.name = "buah " + Buah.jumlahBuah;
    }

    void show()
    {
        System.out.println("Name : " + this.name);
    }
}