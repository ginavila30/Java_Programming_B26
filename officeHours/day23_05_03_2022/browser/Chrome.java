package day23_05_03_2022.browser;

public class Chrome extends Browser {
    @Override
    public void closeBrowser() {
        System.out.println("Closing chrome browser");
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening chrome browser");
    }
}
