package hw_11;

public class MyFile implements CanBeCloused{

    @Override
    public void clouse() {
        System.out.println("File closed");
    }
}