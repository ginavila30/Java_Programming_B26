package day23_05_03_2022.browser;

public class Browser {
//    public String version;
//    public Browser(String version){
//        this.version=version;
//    }
    public void openBrowser(){
        System.out.println("Opening chrome browser");
    }
    public void closeBrowser(){
        System.out.println("Closing chrome browser");
    }
    public final void navigate(String url){
        System.out.println("Type"+url);
        System.out.println("Press ENTER");
    }
    public final void refresh(){
        System.out.println("Refreshing");
    }
    public final void backward(){
        System.out.println("Going back");
    }
    public final void forward(){
        System.out.println("Moving forward");
    }
}
