package latihan;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        //tipe data primitif = buakn primitif
        //byte = Byte, short = Short, int = Integer
        //long = Long, float = Float, double = Double
        //char = Character, boolean = Boolean

        //default bukan primitif adalah null


        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte;
        iniByte = 40;
        System.out.println(iniByte);

        // Byte iniBytesj; // ini bakal error karena tidak ada keterangan apapun
        Byte iniByteDua = null; //kita bisa menuliskan null jika belum memikirkan input apa
        System.out.println(iniByteDua);


        //konversi dari primitif ke bukan primitif
        int iniInt = 10000;
        Integer iniInteger2 = iniInt;

        System.out.println(iniInteger2);


        //konversi dari bukan primitif ke primitif
            // primitif nama = nama_bukanPrimitif.primitifValue(); 
        //satu turunan
        int age = 30;
        Integer iniObject = age;

        int intObject = iniObject.intValue();
        System.out.println(intObject);

        Long amount = 10000L;
        long longAmount = amount.longValue();
        System.out.println(longAmount);
        //konversi dari bukan primitif ke primitif beda turunan
        short shortObject = iniObject.shortValue();
        System.out.println(shortObject);

        byte byteObject = iniObject.byteValue();
        System.out.println(byteObject);
    }
}
