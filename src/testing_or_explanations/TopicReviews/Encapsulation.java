package testing_or_explanations.TopicReviews;

public class Encapsulation {
    //Access Modifiers -> variables and methods ->  determines the visibility.

    public String a; // Access inn th entire project.
    protected  String b;// Pending
    String c;// Default when we don't give an access modifier key word -> access within same package.
    private String d ;// Only access within the same class.

//    public Encapsulation (String d){
//        this.d=d;
//    }
    // Encapsulation -> hiding data from direct access. When we have private access modifier, and we want to access the data indirectly.
    // How to do it? 1) private access modifier 2) public getter and setter methods.
    // getter method -> access indirectly the data.
    //setter method -> modify indirectly the data.

    public String getD(){
        return d;
    }

    public void setD(String d){
        this.d=d;
    }
}
