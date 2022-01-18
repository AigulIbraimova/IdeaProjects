package interfaces;

public interface Bookmark {

    void addUrlToBookmark();

    public abstract void removeUrlFromBookmark();

    public default void defMethod(){
        System.out.println("This is default method from Bookmark");
    }

    static void statMethod(){
        System.out.println("This method is static");
    }
}
