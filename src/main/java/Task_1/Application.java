package Task_1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        MyBrowser browser = new MyBrowser();
        MyFile file = new MyFile();
        MySocket socket = new MySocket();

        List<CanBeClosed> list = new ArrayList<>();
        list.add(browser);
        list.add(file);
        list.add(socket);

        SessionCloser closer = (entities) -> {
            for (CanBeClosed entity : entities) {
                entity.close();
            }
        };

        closer.closeSession(list);
    }
}
