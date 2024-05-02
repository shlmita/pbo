package inheritance;
import java.util.*;

class Inheritmain {
    public static void main(String[] args) {
        Student mahasiswa = new Student();
        Scanner scanner = new Scanner(System.in);
        
        // Input nama
        System.out.print("Masukkan Nama: ");
        mahasiswa.name = scanner.nextLine();
        
        // Input alamat
        System.out.print("Masukkan Alamat: ");
        mahasiswa.address = scanner.nextLine();
        
        // Input NIM
        System.out.print("Masukkan NIM: ");
        mahasiswa.nim = scanner.nextLine();

        // Input NIM
        System.out.print("Masukkan Hobi: ");
        mahasiswa.hobi = scanner.nextLine();

        // Memanggil method identity dari objek mahasiswa
        mahasiswa.identity();

        // Memanggil method hitung dari objek mahasiswa
        mahasiswa.hitungTagih();
        
        scanner.close(); // Menutup Scanner setelah penggunaan selesai
    }
}