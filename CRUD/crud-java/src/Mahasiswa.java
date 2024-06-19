/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Mahasiswa {
    private int id;
    private String nama;
    private String alamat;
    private int umur;

    // Constructor, getters, dan setters
    public Mahasiswa(int id, String nama, String alamat, int umur) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public Mahasiswa(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public int getUmur() { return umur; }
    public void setUmur(int umur) { this.umur = umur; }
}
