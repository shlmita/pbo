package latihan;

public class Variable {
    public static void main(String[] args) {
        String name; //merujuk ke name dibawah atau tidak mau diinputkan secara langsung
        name = "Mita";

        System.out.println(name); //print name "Mita"

        //bisa juga secara langsung
        int age = 30;
        System.out.println(age);

        //jika tidak diinputkan akan muncul null=String, 0=int
        // String address;
        // System.out.println(address);

        name = "Shelomita"; //input baru
        System.out.println(name); //akan print baru



        //KATA KUNCI VAR
        //memudahkan tanpa harus memasukan tipe data
        var firstName = "Shelomita";
        var lastName = "Fitriyani";
        var fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // var age;
        // age = 20; //ini akan error karena var harus input langsung tanpa deklarasi





        //KATA KUNCI FINAL = KONSTAN = PATEN
        final var address = "nakula";
        final var umur = 90;
        final String aplication = "Belajar java";
        
        // aplication = "Belajar saja"; //ini nnati akan error karena final tidak dapat diubah inputnya

    }
}
