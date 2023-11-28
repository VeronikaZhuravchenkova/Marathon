package day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();

        musicBands.add(new MusicBand("Земляне", 1980));
        musicBands.add(new MusicBand("Алиса", 1983));
        musicBands.add(new MusicBand("Чайф", 1990));
        musicBands.add(new MusicBand("Мумий Троль", 1990));
        musicBands.add(new MusicBand("Машина времени", 1980));
        musicBands.add(new MusicBand("LINKIN PARK", 2007));
        musicBands.add(new MusicBand(" Evanescence", 2010));
        musicBands.add(new MusicBand("Rammstein", 2007));
        musicBands.add(new MusicBand("Slipknot",2000));
        musicBands.add(new MusicBand("Papa Roach", 2013));

        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(" ");
        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> musicBandsNew = new ArrayList<>();
        for(MusicBand band: bands) {
            if (band.getYear() >= 2000) {
                musicBandsNew.add(band);
            }
        }
        return musicBandsNew;
    }
}
