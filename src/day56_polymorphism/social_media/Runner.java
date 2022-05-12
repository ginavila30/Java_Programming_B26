package day56_polymorphism.social_media;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        Instagram obj1 = new Instagram("ginavila30", "User5421","Lorena Mejia");
        Instagram obj2 = new Instagram("ginisoda", "User1234", "Majid Sodavi");
        Facebook obj3 = new Facebook("maxsoda", "sodavitech456", "Daniel Mejia", 34, 1200);
        Facebook obj4 = new Facebook("LoreMej", "lorenita794", "Lorena Mejia", 27, 3400);
        Facebook obj5 = new Facebook("pfbr53", "pfbr2022", "Majid Sodavi", 28, 6000);

        ArrayList<SocialMedia> list = new ArrayList<>();
        list.addAll(Arrays.asList(obj1, obj2, obj3, obj4, obj5));
        System.out.println(list);

        ArrayList<Facebook> listFb = new ArrayList<>();
        for (SocialMedia each : list) {
            if (each instanceof Facebook) {
                if (((Facebook) each).getNumberOfFriends() < 5000) {
                    listFb.add((Facebook) each);
                }
            }
        }
        System.out.println(listFb);


        for (SocialMedia each : list) {
            if (each instanceof Instagram) {
              ((Instagram) each).likePicture();
            }
        }
ArrayList<String>bothPlatformsUserFullName=new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            int count=0;
            for (int j = 0; j < list.size() ; j++) {
                if(list.get(i).fullName.equals(list.get(j).fullName)){
                    count++;
                }
            }
            if(count>1&&!bothPlatformsUserFullName.contains(list.get(i).fullName)){bothPlatformsUserFullName.add(list.get(i).fullName);}
        }
        System.out.println(bothPlatformsUserFullName);



    }
}
