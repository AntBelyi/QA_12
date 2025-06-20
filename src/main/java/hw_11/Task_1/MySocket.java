package hw_11.Task_1;

public class MySocket implements CanBeClosed {
    public void close() {
        System.out.println("Socket closed");
    }
}
