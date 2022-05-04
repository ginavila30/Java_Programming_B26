package day23_05_03_2022.browser;

public class BrowserObjects {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.openBrowser();
        chrome.navigate("www.google.com");
        chrome.refresh();
        chrome.closeBrowser();

    }

}
