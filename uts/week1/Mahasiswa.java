package week1;

import java.util.ArrayList;
import java.util.Iterator;
import week5.Matakuliah;

public class Mahasiswa {
    private String nim, nama, tanggal_lahir;
    private ArrayList<Double> nilai = new ArrayList<Double>();
    private ArrayList<Matakuliah> mk = new ArrayList<Matakuliah>();

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public Mahasiswa(String nim, String nama, String tanggal_lahir) {
        this.nim = nim;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getTglLahir() {
        return tanggal_lahir;
    }

    public void insertNilai(double nl) {
        nilai.add(nl);
    }

    public void insertMatkul(String matkul, String kelompok, int sks) {
        mk.add(new Matakuliah(matkul, kelompok, sks));
    }

    public void belajar() {
        System.out.println(nama + " belajar");
    }

    public void mainGame() {
        System.out.println(nama + " main game");
    }

    public void getIdentitas() {
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("NIM mahasiswa: " + nim);
        getNilai();
    }

    public void getNilai() {
        Iterator<Double> it = nilai.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void getMatkul() {
        System.out.println("Daftar Mata Kuliah :");
        Iterator<Matakuliah> matkul = mk.iterator();
        while (matkul.hasNext()) {
            Matakuliah m = matkul.next();
            System.out.println(m.getNamaMatkul() + " - " + m.getKelompok() + " - " + m.getSks());
        }
    }
}
