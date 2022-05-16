package day56_polymorphism.social_media;

import java.time.LocalTime;
import java.util.ArrayList;

public class Facebook extends SocialMedia implements Groups {
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> posts;
    int numberOfGroups;

    public Facebook(String username, String password) {
        this.username = username;
        setPassword(password);
        personalUrl = "facebook.com/" + username;
        posts = new ArrayList<>();

    }

    public Facebook(String username, String password, String fullName) {
        this(username, password);
        setFullName(fullName);

    }

    public Facebook(String username, String password, String fullName, int age, int numberOfFriends) {
        this(username, password, fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);

    }

    @Override
    public void joinGroup(String group) {
        System.out.println(username+" has joined "+group);
        numberOfGroups++;

    }

    @Override
    public void leaveGroup(String group) {
        System.out.println(username+" has left "+group);
        numberOfGroups--;
    }

    public void setFullName(String fullName) {
       String fullName2=fullName.replace(" ","");
        boolean valid = true;
        for (int i = 0; i < fullName2.length(); i++) {
            if (!Character.isLetter(fullName2.charAt(i))) {
                valid = false;
                break;
            }
        }
        if (valid) {
            this.fullName = fullName;
        } else {
            System.out.println("invalid name");
            this.fullName = "no name";
        }
    }

    public void setPassword(String password) {
        if (!password.contains(username)) {
            this.password = password;
        } else {
            System.out.println("Password contained username. Default password created: ‘password’");
            this.password = "password";
        }
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        if (numberOfFriends > 0 && numberOfFriends < 5000) {
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println(" Invalid Numbers of Friends");
        }
    }

    public long getNumberOfFriends() {
        return numberOfFriends;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    static {
        platform = "Facebook";
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);
    }

    @Override
    public void post(Object media) {
        Post postObj = (Post) media;
        posts.add(postObj);
    }

    @Override
    public void notifications() {
        int currentTime = LocalTime.now().getHour();
        if (currentTime >= 8 && currentTime <= 17) {
            System.out.println("Notifications");
        } else {
            System.out.println("Sleep Mode");
        }
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "age=" + getAge() +
                ", numberOfFriends=" + getNumberOfFriends() +
                ", posts=" + getPosts() +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public boolean sendFriendRequest(Facebook friend) {
        if (getNumberOfFriends() < 5000) {
           if(friend.getNumberOfFriends()<5000){
               System.out.println("Friend request sent to "+username);
               numberOfFriends++;
            return true;}else{
               System.out.println(username+" cannot accept any more friend request. ");
               return false;
           }
        } else {
            System.out.println("You have reached the limit of friends.");
            return  false;
        }
    }


}
