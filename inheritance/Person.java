package inheritance;
import java.util.*;

class Person {
    // aribut dan method super class
    protected String name;
    protected String address;
    protected String hobi;

    public void identity()
    {
        System.out.println("Nama : " + name);
        System.out.println("Alamat : " + address);
        System.out.println("Hobi : " + hobi);
    }
}