package coba;

import coba.Hero;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero("ucup");

        hero1.display();

        //class objec jadi super class
        Object hero2 = hero1;

        String hero2_str = hero2.toString();
        String hero1_str = hero1.toString();
        System.out.println(hero2_str);
        System.out.println(hero1_str);
    }
}