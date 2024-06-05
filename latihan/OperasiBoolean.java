package latihan;

public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 85;

        boolean lulusAbsen = absen >= 75;
        // 70 lebih dari sama dengan 75 -> false
        boolean lulusNilai = nilaiAkhir >= 75;
        // 85 lebih dari sama dengan 75 -> true

        var lulus = lulusAbsen && lulusNilai;
        // false && true -> false
        System.out.println(lulus);
    }
}
