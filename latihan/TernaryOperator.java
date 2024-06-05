package latihan;

public class TernaryOperator {
    public static void main(String[] args) {
        //versi penggunaan if else
        var nilai = 70;
        String ucapan;

        if(nilai >= 75) {
            ucapan = "lulus";
        } else {
            ucapan = "gagal";
        }

        System.out.println(ucapan);


        //versi penggunaan ternary operator = lebih singkat
        var nilaidu = 80;
        
        String ucapandu = nilaidu >= 75 ? "Selamat anda lulus" : "Silahkan coba lagi";
        System.out.println(ucapandu);

        String ucapanti = nilaidu >= 85 ? "Selamat anda lulus" : "Silahkan coba lagi";
        System.out.println(ucapanti);
    }
}
