package latihan;

public class Continue {
    public static void main(String[] args) {
        
        for(var nilai = 1; nilai <= 10; nilai++) {
            if(nilai % 2 == 0) { //angka ganjil (jika 0 diubah jadi 1 maka akan muncul genap)
                continue; //ini akan berhenti dan diteruskan ke perulangan selanjutnya
            }
            System.out.println("APA " + nilai);
        }
    }
}
