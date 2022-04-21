package day50_inheritance.app;

public class MyPhoneApps {
    public static void main(String[] args) {
        App application1= new App("Facebook",1.5);
        application1.download();
        System.out.println(application1);

        Instagram insta1=new Instagram(3.5,"purple");
        insta1.download();
        insta1.postPicture();
        System.out.println(insta1);

        Youtube youtube1=new Youtube(8.4);
        youtube1.download();
        System.out.println(youtube1);
        youtube1.watchVideo();

    }
}
