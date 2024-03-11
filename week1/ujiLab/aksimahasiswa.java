package week1.ujiLab;
public class aksimahasiswa //sama nama file
{
    public static void main(String[] agrs) //konsep kayak int main
    {
        mahasiswa mhs1 = new mahasiswa();  //nama objek = mhs1;;;; untuk tipe data sejenis float = mahasiswa
        mhs1.nim = "A11.22.14319"; //mhs1 untuk class
        mhs1.nama = "Shelomita";
        mhs1.usia = 19;
        mhs1.getIdentitas();
        mhs1.belajar();

        mahasiswa mhs2 = new mahasiswa();  //nama objek = mhs1;;;; untuk tipe data sejenis float = mahasiswa
        mhs2.nim = "A11.22.14319"; //mhs1 untuk class
        mhs2.nama = "Shelomita";
        mhs2.usia = 19;
        mhs2.getIdentitas();
        mhs2.belajar();
    }
}

// untuk buat class "javac week1\aksimahasiswa.java"
// untuk run "java week1.aksimahasiswa"