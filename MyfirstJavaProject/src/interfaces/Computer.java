package interfaces;

public class Computer {

    public static void main (String[] args){
        Computer computer = new Computer();
        Chrome chrome = new Chrome();

        chrome.openBrowser();
        chrome.goToUrl("google.com");
        chrome.closeBrowser();
        chrome.addUrlToBookmark();
        chrome.closeBrowser();
        chrome.defMethod();
        Bookmark.statMethod();

    }

}
