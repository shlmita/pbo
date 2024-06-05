package latihan;

public class Break {
    public static void main(String[] args) {
        
        var nilai = 1;
        
        while(true) {
            System.out.println("apa " + nilai);
            nilai++; //jika ini saja program tidak akan berhenti

            //maka harus ditambah kondisi break
            if(nilai > 10) {
                break; //berhenti tanpa melakukan perulangan kembali
            }
        }

        System.out.println("BERHENTI LAH");
    }
}
