package hw_11;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        MyBrowser myBrowser = new MyBrowser();
        MyFile myFile = new MyFile();
        List<CanBeCloused> entities = new ArrayList<>();
        entities.add(myFile);
        entities.add(myBrowser);

        SessionCloser sessionCloser = value -> {
            for (CanBeCloused canBeCloused : value) {
                canBeCloused.clouse();
            }
        };
        sessionCloser.closeSession(entities);

        System.out.println("Hello, I am from Ukraine!");
    }
}
