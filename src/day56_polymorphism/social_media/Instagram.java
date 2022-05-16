package day56_polymorphism.social_media;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements hasPictures{
    private int numberOfFollowers;
    private int numberOfFollowings;
    private ArrayList<Picture> pictures = new ArrayList<>();

    public Instagram(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName=fullName;
        personalUrl = "Instagram.com/" + username;
    }

    static {
        platform = "Instagram";
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfFollowings() {
        return numberOfFollowings;
    }

    public void setNumberOfFollowings(int numberOfFollowings) {
        this.numberOfFollowings = numberOfFollowings;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);
    }

    @Override
    public void post(Object media) {

        pictures.add((Picture) media);
    }

    @Override
    public void notifications() {
        int currentTime = LocalTime.now().getHour();
        if (currentTime >= 10 && currentTime <= 20) {
            System.out.println("Notifications");
        } else {
            System.out.println("Sleep Mode");
        }
    }

    @Override
    public void likePicture() {
        System.out.println("Liking a picture on Instagram");
    }

    @Override
    public void unLikePicture() {
        System.out.println("Unliking a picture on Instagram");
    }

    @Override
    public void sharePicture() {
        System.out.println("Sharing a picture on Instagram");
    }

    @Override
    public String toString() {
        return "Instagram{" +
                "numberOfFollowers=" + numberOfFollowers +
                ", numberOfFollowings=" + numberOfFollowings +
                ", list=" + pictures +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
