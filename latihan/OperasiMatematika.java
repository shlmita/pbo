package latihan;

public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b); //penjumlahan
        System.out.println(a - b); //pengurangan
        System.out.println(a * b); //perkalian
        System.out.println(a / b); //pembagian
        System.out.println(a % b); //sisa bagi





        //AUGMENTED ASSIGNMENTS
        int c = 100;

        c += 10; //c = c + 10
        System.out.println(c);

        c-= 10; //c = c - 10
        System.out.println(c);

        c *= 10; // c = c * 10
        System.out.println(c);




        //UNARY OPERATOR
        //ditempatkan di depan variabel
        //++ a=a+1
        //-- a=a-1
        //- negatif
        //+ positif
        //! boolean kebalikan
        int d = 100;
        int e = 10;

        d++; // d = d+1   atau     d += 1
        System.out.println(d);

        d--; //d = d-1      atau    d -= 1
        System.out.println(d);

        System.out.println(!true); //hasilnya nanti false
        System.out.println(!false); //hasilnya nanti true
    }
}
