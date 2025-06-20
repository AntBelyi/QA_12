package Task_1;

public class MySocket implements CanBeClosed {
    public void close() {
        System.out.println("Socket closed");
    }
}
