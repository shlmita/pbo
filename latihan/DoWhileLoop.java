package latihan;

public class DoWhileLoop {
    public static void main(String[] args) {
        //do while loop pengecekan di akhir, yang pertama adalah melakukan perulangan

        var nilai = 100;
        // while (nilai <= 10) {
        //     System.out.println(nilai);
        //     nilai++;
        // }
        // tidak ada hasil apa pun

        do{
            System.out.println("apa " +nilai);
            nilai++;
        } while (nilai <= 10);
        //akan tetap ada hasil akhir yaitu "apa 100" walaupun perulangan(while) salah
    }
}
