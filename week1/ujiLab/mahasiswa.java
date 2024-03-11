package week1.ujiLab;
public class mahasiswa
{
    String nim, nama; //karakter
    int usia; //atribut

    public void belajar() //method(perilaku,identitas), sebgai prosedur
    {
        System.out.println(nama + " belajar");
    } 

    public void mainGame()
    {
        System.out.println(nama + " main game");
    }

    public void getIdentitas()
    {
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("NIM mahasiswa: " + nim);
        System.out.println("Usia: " + usia);
    }
    public static void main(String[] args) //untuk print seperti int main
    {
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nim = "A11.2022.14319";
        mahasiswa1.nama = "Shelomita";
        mahasiswa1.usia = 19;

        mahasiswa1.getIdentitas();
        mahasiswa1.belajar();
        mahasiswa1.mainGame();
    }
}