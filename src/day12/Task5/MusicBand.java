package day12.Task5;

import java.util.Iterator;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for(MusicArtist member: a.getMembers()) {
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }
}
