package com.argya;

public class RnB implements Blues, Jazz{

    @Override
    public void genreBlues(String artistName) {
        System.out.println(artistName + " adalah musisi Blues");
    }

    @Override
    public void genreJazz(String artistName) {
        System.out.println(artistName + " adalah musisi Jazz");
    }
}
