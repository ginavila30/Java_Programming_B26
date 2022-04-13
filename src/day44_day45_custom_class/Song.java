package day44_day45_custom_class;

public class Song {
    String name;
    double length;
    String artist;
    String genre;

    public Song(String name){
        this.name=name;
    }
    public Song(String name,double length){

        this(name); //same as ->this.name=name; example of chaining constructor
        this.length=length;
    }

    public Song(String name, double length, String artist, String genre) {
       this(name,length);//chaining again
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
