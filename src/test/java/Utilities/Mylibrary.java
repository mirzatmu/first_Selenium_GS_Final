package Utilities;

public class Mylibrary {

    public static void sleep(double a){
        try {
            Thread.sleep((int)(a*1000));
        } catch (InterruptedException e) {

        }
    }
}