package week1.tugas;
public class e2c { //Volume tabung dengan diketahui diameter = 5, tinggi = 10
    public static void main(String[] args) {
        double diameter = 5.0;
        double tinggi = 10.0;
        double jariJari = diameter / 2.0;
        double volume = Math.PI * jariJari * jariJari * tinggi;
        
        System.out.println("Diameter tabung: " + diameter);
        System.out.println("Tinggi tabung: " + tinggi);
        System.out.println("Volume tabung: " + volume);
    }
}
