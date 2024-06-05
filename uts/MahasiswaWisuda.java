package uts;

import week1.Mahasiswa;

public class MahasiswaWisuda extends Mahasiswa {
    private String tanggalWisuda;

    public MahasiswaWisuda(String nim, String nama, String tanggal_lahir, String tanggalWisuda) {
        super(nim, nama, tanggal_lahir);
        this.tanggalWisuda = tanggalWisuda;
    }

    public String getTanggalWisuda() {
        return tanggalWisuda;
    }

    public void setTanggalWisuda(String tanggalWisuda) {
        this.tanggalWisuda = tanggalWisuda;
    }

    @Override
    public void getIdentitas() {
        super.getIdentitas();
        System.out.println("Tanggal Wisuda: " + tanggalWisuda);
    }
}
