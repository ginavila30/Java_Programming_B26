package day52_final_key_word.practice_unit_5;

public class Netflix extends Streaming {
    String showName;
    int episodeNumber;
    int seasonNumber;

    public Netflix(String company, String showName, int episodeNumber,int seasonNumber){
        super(company);
        this.showName=showName;
        this.episodeNumber=episodeNumber;
        this.seasonNumber=seasonNumber;
    }

}
