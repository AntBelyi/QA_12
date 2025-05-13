package hw_6.Task_4;

public class Application {
    public static void main(String[] args) {

        Figure sguare = new Square(4.5);
        System.out.println("Perimeter of a square " + sguare.getPerimeter());
        System.out.println("Area of a square " + sguare.getArea());

        Figure circle = new Circle(3.3);
        System.out.println("Perimeter of a circle " + circle.getPerimeter());
        System.out.println("Area of a circle " + circle.getArea());

        Figure triagle = new Triangle(5.2, 4.8, 3.6, 4.2, 3.3);
        System.out.println("Perimeter of a triagle " + triagle.getPerimeter());
        System.out.println("Area of a triagle " + triagle.getArea());


    }
}
