package day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Kate");
        members1.add("John");
        members1.add("Nick");

        MusicBand musicBand1 = new MusicBand("ABC",2000, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Bob");
        members2.add("pop");

        MusicBand musicBand2 = new MusicBand("NBY", 2013,members2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();


    }
}
