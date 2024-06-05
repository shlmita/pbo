package latihan;

public class SwitchStatement {
    public static void main(String[] args) {

    //switch statement biasanya digunakan dengan tipe data primitif seperti int, char, byte, short, dan enum, serta mulai dari Java 12, dapat digunakan dengan String.
    //jika boolean true false harus pakai if else saja
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Anda lulusan terbaik");
                break; //untuk menghentikan
            case "B": //digabung dengan C
            case "C": //digabung dengan B
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("NGULANG COK");
                break;
            default:
                System.out.println("salah input su");
        }


        //versi ringkasnya = switch lambda
        switch(nilai) {
            case "A" -> System.out.println("anda lulus");
            case "B", "c" -> System.out.println("met lulus"); //digabung
            case "D" -> System.out.println("ngga lulus bg");
            default -> {
                System.out.println("input lu salah babi");
            }
        }


        //versi disimpan dulu = switch tanpa yield(println)
        String ucapan;
        switch(nilai) {
            case "A" -> ucapan = "anda lulusss";
            case "B", "c" -> ucapan = "met lulus"; //digabung
            case "D" -> ucapan = "ngga lulus bg";
            default -> {
                ucapan = "input lu salah babi";
            }
        }
        System.out.println(ucapan);


        //versi simpan dulu = switch yield
        ucapan = switch (nilai) {
            case "A":
                yield "anda lulusss";
            case "B", "C": 
                yield "met lulus"; //digabung
            case "D":
                yield "ngga lulus bg";
            default: 
                yield "input lu salah babi";
        };
        System.out.println(ucapan);

    }
}
