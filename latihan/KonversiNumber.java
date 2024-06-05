package latihan;

public class KonversiNumber {
    public static void main(String[] args) {
        //urutan Widening casting (otomatis) byte -> short -> int -> long -> float -> double
        
        //naik ke atas
        byte iniByte = 10;
        short iniShort = iniByte; //ambil dari byte
        int iniInt = iniShort;

        //besar ke kecil
        //Narrowing Casting(Manual) double -> float -> long -> int -> char -> short -> byte

        // byte iniByte2 = iniInt2; //ini tidak bisa harus dilakukan secara manual
        // byte iniByte2 = (byte) iniInt2; //ini manualnya
        
        int iniInt2 = 1000; //ini dapat overflow karena 1000 tidak bisa di konversi paksa ke byte
        byte iniByte2 = (byte) iniInt2; //jika dijalankan akan overflow, karena byte hanya bisa menampung 127
    }
}
