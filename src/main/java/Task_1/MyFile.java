package Task_1;

public class MyFile implements CanBeClosed {
    public void close() {
        System.out.println("File closed");
    }
}
