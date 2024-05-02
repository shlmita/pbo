package inheritance;
import java.util.*;

// inherit dari person
public class Student extends Person {
    String nim;
    
    // method baru dari subclass
    public String getNim()
    {
        return nim;
    }

	// method hitung tagihan
	public void hitungTagih() 
	{
		Scanner scanner = new Scanner(System.in);

		// input biaya spp
		System.out.println("Masukan biaya SPP: ");
		double spp = scanner.nextDouble();

		// input biaya sks
		System.out.println("Masukan biaya SKS: ");
		double sks = scanner.nextDouble();

		// input biaya modul
		System.out.println("Masukan biaya Modul: ");
		double modul = scanner.nextDouble();

		// menutup scanner
		scanner.close();

		// menghitung total tagihan
		double total = spp + sks + modul;

		// menampilkan tagihan pembayaran
		System.out.println("Tagihan Pembayaran:");
		System.out.printf("SPP: Rp%,.0f%n", spp);
    	System.out.printf("SKS: Rp%,.0f%n", sks);
    	System.out.printf("Modul: Rp%,.0f%n", modul);
    	System.out.printf("Total Tagihan: Rp%,.0f%n", total); 
		// Menggunakan format %,.0f untuk bilangan double tanpa desimal
	}

	@Override
	public void identity()
	{
		System.out.println("NIM: " + getNim());
		super.identity();
	}
}