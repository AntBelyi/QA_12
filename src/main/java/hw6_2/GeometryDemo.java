// Абстрактний клас Figure
abstract class Figure {
    abstract double getArea();
    abstract double getPerimeter();
}

// Клас Square
class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square with side = " + side;
    }
}

// Клас Triangle
class Triangle extends Figure {
    private double base, height, side1, side2, side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double getArea() {
        return (base * height) / 2;
    }

    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle with base = " + base + ", height = " + height +
                ", sides = [" + side1 + ", " + side2 + ", " + side3 + "]";
    }
}

// Клас Circle
class Circle extends Figure {
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius;
    }
}

// Головний клас
public class GeometryDemo {
    public static void main(String[] args) {
        Figure square = new Square(5);
        Figure triangle = new Triangle(6, 4, 6, 5, 7);
        Figure circle = new Circle(3.5);

        System.out.println("--- Square ---");
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        System.out.println("\n--- Triangle ---");
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        System.out.println("\n--- Circle ---");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
