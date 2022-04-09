package day02_print_statements.day09_03_15_2022;

public class WebsiteChecker {  public static void main(String[] args) {
    String [] websites= {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
            "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org"," nba.com",
            "comcast.net", "tamu.edu", "utexas.edu"};

    int com=0;
    int org=0;
    int edu=0;
    int diff=0;

    for (String url:websites){
        if (url.contains(".com")){
            com++;
        }else if(url.contains(".org")){org++;}else if(url.contains(".edu")){edu++;}else{diff++;}

    }
    System.out.println(".com domains: "+com+"\n.org domains: "+org+"\n.edu domaind: "+edu+"\nDifferent domains: "+diff);
}
}
