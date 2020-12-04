package com.argya;

public class HardRock extends RnB implements PopRock,ProgressiveRock, PsychedelicRock {
    @Override
    public void genrePopRock(String artistName) {

    }

    @Override
    public void genreProgressiveRock(String artistName) {

    }

    @Override
    public void genrePsychedelicRock(String artistName) {

    }

    public void genreHardRock(String artistName){
        System.out.println(artistName + " adalah musisi HardRock");
    }
}
