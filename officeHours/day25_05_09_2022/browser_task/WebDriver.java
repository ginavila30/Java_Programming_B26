package day25_05_09_2022.browser_task;

public interface WebDriver {
    //all methods are abstract and public by default
    void get(String URL);
    void close();
    void quit();

}
