package day52_final_key_word.practice_unit_5;

public class UsingAmazonAccount {
    public static void main(String[] args) {
        AmazonAccount obj=new AmazonAccount("Gina","ginavila@hotmail.com",true);
        System.out.println(obj);
        System.out.println(obj.getEmail());
        obj.setEmail("majidsoda@gmail.com");
        System.out.println(obj.getName());
        obj.setName("Majid");
        System.out.println(obj.isHasPrime());
        obj.setHasPrime(false);
        System.out.println(obj);
    }
}
