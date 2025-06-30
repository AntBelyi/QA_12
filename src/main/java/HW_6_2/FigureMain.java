// Abstract class Figure
abstract class Figure {
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Square class
class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square {side=" + side + "}";
    }
}

// Triangle class
class Triangle extends Figure {
    private double base;
    private double height; // Used for area calculation
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        // Assuming base and height are provided for area calculation
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle {base=" + base + ", height=" + height + ", side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "}";
    }
}

// Circle class
class Circle extends Figure {
    private double radius;
    private static final double PI = Math.PI; // Using Math.PI for constant

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {radius=" + radius + "}";
    }
}

// Main class for demonstration
public class FigureMain {
    public static void main(String[] args) {
        System.out.println("--- Calculating Perimeters and Areas of Figures ---");

        // Create instances of classes with Figure type
        Figure square = new Square(5.0);
        Figure triangle = new Triangle(10.0, 8.0, 7.0, 12.0, 15.0); // base, height, side1, side2, side3
        Figure circle = new Circle(7.0);

        // Process Square
        System.out.println("\nProcessing Square:");
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Process Triangle
        System.out.println("\nProcessing Triangle:");
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        // Process Circle
        System.out.println("\nProcessing Circle:");
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\n--- End of Figure Calculations ---");
    }
}