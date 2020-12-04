package com.argya;

import com.argya.HeavyMetal;

public class Metal extends HardRock implements HeavyMetal {
    @Override
    public void genreHeavyMetal(String artistName) {

    }

    @Override
    public void genrePunk(String artistName) {

    }

    public void genreMetal(String artistName){
        System.out.println(artistName + " adalah musisi Metal");
    }
    public void genreGrunge(String artistName){
        System.out.println(artistName + " adalah musisi Grunge");
    }
}
