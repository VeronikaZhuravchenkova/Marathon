package day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Kate",23));
        members1.add(new MusicArtist("Hi",34));

        MusicBand musicBand1 = new MusicBand("AVC",2000,members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Bob",23));
        members2.add(new MusicArtist("Kor",54));

        MusicBand musicBand2 = new MusicBand("Bur",2012, members2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
