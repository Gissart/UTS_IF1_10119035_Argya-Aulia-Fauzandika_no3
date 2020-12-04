package com.argya;
/*
Nama        : Argya Aulia Fauzandika
Kelas       : IF1
NIM         : 10119035
Deskripsi   : Program uts 
*/
public class UTS12018 {
    public static void main(String[] args){
        MusicGenre music = new MusicGenre();
        Metal metal = new Metal();
        music.setArtisName("Jimmy Hendrik");
        metal.genreBlues(music.getArtisName());

        MusicGenre music2 = new MusicGenre();
        music2.setArtisName("Chad Baker");
        metal.genreJazz(music2.getArtisName());

        MusicGenre music3 = new MusicGenre();
        music3.setArtisName("Bob Dylan");
        Folk folk = new Folk();
        folk.genreFolk(music3.getArtisName());

        MusicGenre music4 = new MusicGenre();
        music.setArtisName("Elvis Presley");
        Rockability rockA = new Rockability();
        rockA.genreRockability(music4.getArtisName());

        MusicGenre music5 = new MusicGenre();
        music5.setArtisName("DreamTheater");
        metal.genreProgressiveRock(music5.getArtisName());

        MusicGenre music6 = new MusicGenre();
        music6.setArtisName("The doors");
        metal.genrePsychedelicRock(music6.getArtisName());

        MusicGenre music7 = new MusicGenre();
        music7.setArtisName("Kiss");
        metal.genrePopRock(music.getArtisName());

        MusicGenre music8 = new MusicGenre();
        music8.setArtisName("MXPX");
        metal.genrePunk(music8.getArtisName());

        MusicGenre music9 = new MusicGenre();
        music9.setArtisName("METALLICA");
        metal.genreHeavyMetal(music.getArtisName());

        MusicGenre music10 = new MusicGenre();
        music10.setArtisName("Mesin Tempur");
        Grindcore grind = new Grindcore();
        grind.genreGrindcore(music10.getArtisName());

        MusicGenre music11 = new MusicGenre();
        music11.setArtisName("JASAD");
        DeathMetal detm = new DeathMetal();
        detm.genreDeathMetal(music11.getArtisName());

        MusicGenre music12 = new MusicGenre();
        music12.setArtisName("Revenge The Fate");
        DeathCoreKepiting kepiting = new DeathCoreKepiting();
        kepiting.genreDeathCoreKepiting(music12.getArtisName());

        MusicGenre music13 = new MusicGenre();
        music13.setArtisName("Behemoth");
        BlackMetal bm = new BlackMetal();
        bm.genreBlackMetal(music13.getArtisName());

        MusicGenre music14 = new MusicGenre();
        music14.setArtisName("HATEBREED");
        NewSkul newSkul = new NewSkul();
        newSkul.genreNewSkul(music14.getArtisName());



    }
}
