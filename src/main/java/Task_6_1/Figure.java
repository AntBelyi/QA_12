package hw_6_1;

public abstract class Figure {
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Figure{}";
    }
}