package latihan;

public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        if(nilai >= 75 && absen >= 75){
            System.out.println("Selamat lulus");
        }
        else {
            System.out.println("anda gagal");
        }

        if(nilai >= 80 && absen >= 80) {
            System.out.println("nilai anda A");
        } else if(nilai >= 75 && absen >= 75) {
            System.out.println("nilai anda B");
        } else if(nilai >= 70 && absen >= 70) {
            System.out.println("nilai anda C");
        } else if(nilai >= 60 && absen >= 60) {
            System.out.println("nilai anda D");
        } else {
            System.out.println("Nilai anda E silahkan remed");
        }
    }
}
