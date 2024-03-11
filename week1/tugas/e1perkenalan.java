package week1.tugas;
public class e1perkenalan {

    String nama, prodi, kampus, program;

    public void perkenalan()
    {
        System.out.println("Halo, nama saya adalah " + nama);
        System.out.println("Saya adalah mahasiswa " + prodi + " " + kampus);
        System.out.println("Saya sedang menulis program " + program);
    }
    public static void main(String[] args) {
        e1perkenalan keter = new e1perkenalan();
        keter.nama = "Shelomita Fitriyani";
        keter.prodi = "Teknik Inforatika";
        keter.kampus = "Universitas Dian Nuswantoro";
        keter.program = "Java";

        keter.perkenalan();
    }
}