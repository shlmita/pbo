/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MahasiswaCon mahasiswaCon = new MahasiswaCon();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPilih operasi:");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    // Create
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamat = scanner.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Mahasiswa m = new Mahasiswa(nama, alamat, umur);
                    mahasiswaCon.addMahasiswa(m);
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;

                case 2:
                    // Read
                    List<Mahasiswa> mahasiswaList = mahasiswaCon.getAllMahasiswa();
                    System.out.println("Data Mahasiswa:");
                    for (Mahasiswa mhs : mahasiswaList) {
                        System.out.println("ID: " + mhs.getId() + ", Nama: " + mhs.getNama() + ", Alamat: " + mhs.getAlamat() + ", Umur: " + mhs.getUmur());
                    }
                    break;

                case 3:
                    // Update
                    System.out.print("Masukkan ID mahasiswa yang ingin diupdate: ");
                    int idUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan alamat baru: ");
                    String alamatBaru = scanner.nextLine();
                    System.out.print("Masukkan umur baru: ");
                    int umurBaru = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Mahasiswa updateMahasiswa = new Mahasiswa(idUpdate, namaBaru, alamatBaru, umurBaru);
                    mahasiswaCon.updateMahasiswa(updateMahasiswa);
                    System.out.println("Mahasiswa berhasil diupdate!");
                    break;

                case 4:
                    // Delete
                    System.out.print("Masukkan ID mahasiswa yang ingin dihapus: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    mahasiswaCon.deleteMahasiswa(idDelete);
                    System.out.println("Mahasiswa berhasil dihapus!");
                    break;

                case 5:
                    // Exit
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
