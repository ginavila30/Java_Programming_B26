package day23_05_03_2022.browser;

public class Firefox extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("Opening firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing firefox");
    }
}
