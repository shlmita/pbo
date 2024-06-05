package latihan;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] stringArray; //stringArray merupakan nama variabel bebas
        stringArray = new String[3];
        // String[] stringArray2 = new String[3]; bisa juga ditulis seperti ini

        stringArray[0] = "Mita";
        stringArray[1] = "mita";
        stringArray[2] = "mitaa";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //jika ingin menambah atau mengganti dapat ditulis kembali
        stringArray[0] = "Shelomita";
        System.out.println(stringArray[0]);




        //array initializer
        String[] namaNama = {"mita", "mitaaa"};
        System.out.println(Arrays.toString(namaNama)); //untuk print array

        int[] arrayInt = new int[]{
            1,15,18
        };
        System.out.println(Arrays.toString(arrayInt));



        //OPERASI ARRAY
        //array[index] -> mengambil data di array
        //array[index] = value -> mengubah data di array
        //array.length -> mengambil/menghitung panjang array
        long[] arrayLong = {10L, 20L, 30L};
        System.out.println(Arrays.toString(arrayLong));
        System.out.println(arrayLong.length);

        arrayLong[0] = 0; //ini untuk mengubah nilai index ke 0
        //arrayLong[0] = null; //ini menghapus index 0 menjadi null
        System.out.println(Arrays.toString(arrayLong));





        //ARRAY DALAM ARRAY
        String[][] member = {
            {"siA", "siB"},
            {"siC", "siD", "siE"},
            {"siF"}
        };
        System.out.println(member[0]); //menampilkan semua data index ke-0
        System.out.println(member[1][2]); //menampilkan data index ke-1 yang "siE"
    }
}
