package day56_polymorphism.social_media;

public abstract class SocialMedia {
   public String personalUrl;
   public int accountLength;
   public static String platform;
   public String username;
   public String password;
   public String fullName;

   public abstract void directMessaging(String username,String message );
   public abstract void post (Object media);
   public abstract void notifications();


}
