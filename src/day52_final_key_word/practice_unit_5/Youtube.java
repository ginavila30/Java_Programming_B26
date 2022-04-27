package day52_final_key_word.practice_unit_5;

import java.util.ArrayList;

public class Youtube extends Streaming{
    String videoName;
    String  channelName;
    int viewCount;
    ArrayList<String>comments;

    public Youtube(String company, String videoName, String channelName, int viewCount, ArrayList<String>comments){
        super(company);
        this.videoName=videoName;
        this.channelName=channelName;
        this.viewCount=viewCount;
        this.comments=comments;
    }
}
