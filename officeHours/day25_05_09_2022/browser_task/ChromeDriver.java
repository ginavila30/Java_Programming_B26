package day25_05_09_2022.browser_task;

public class ChromeDriver extends RemoteDriver {

    @Override
    public void get(String URL) {
        System.out.println("Opening in Chrome");
    }
}
