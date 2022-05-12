package day25_05_09_2022.browser_task;

public class SafariDriver extends RemoteDriver implements SmartBrowser {

    @Override
    public void talk() {
        System.out.println("Talking");
    }

    @Override
    public void fast() {
        System.out.println("Fastest Browser");
    }

    @Override
    public void secure() {
        System.out.println("Secure Browser");
    }

    @Override
    public void executeScript(String script) {
        super.executeScript(script);
    }

    @Override
    public void TakeScreenShot(String name) {
        super.TakeScreenShot(name);
    }

    @Override
    public void get(String URL) {
        super.get(URL);
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    public void quit() {
        super.quit();
    }
}
