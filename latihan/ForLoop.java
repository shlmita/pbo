package latihan;

public class ForLoop {
    public static void main(String[] args) {
        
        // for(;;) { //ini akan menyebabkan perulangan tanpa henti
        //     System.out.println("ULANG BOS KU");
        // }

        var nilai = 1;
        for(; nilai <= 10 ;){
            System.out.println("Perulangan " + nilai);
            //output pasti 1-10
            nilai++;
        }

        System.out.println(nilai); //output pasti 11


        //var dapat dimasukan ke for agar lebih simpel
        for(var nialidu = 2; nialidu <= 10 ;){
            System.out.println("INI " + nialidu);
            //output pasti 2-10
            nialidu++;
        }


        //var dan nilaiti++; dimasukan ke for agar lebih singkat
        for(var nilaiti = 1; nilaiti <= 10; nilaiti++) {
            System.out.println(nilaiti);
        }
    }
}
