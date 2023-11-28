package day12.Task4;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
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

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for(String member: a.getMembers()) {
            b.getMembers().add(member);
        }
        a.getMembers().clear();;
    }

    public void printMembers() {
        System.out.println(this.members);
    }
}
