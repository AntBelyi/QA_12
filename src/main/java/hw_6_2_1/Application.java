package hw_6_2_1;

public class Application {
    public static void main(String[] args) {
        Figure[] figures = new Figure[] {
                new Square(5),
                new Triangle(6, 4, 6, 5, 4),
                new Circle(3)
        };

        for (Figure figure : figures) {
            System.out.println(figure.toString());
            System.out.println("Area:" + figure.getArea());
            System.out.println("Perimeter:" + figure.getPerimeter());
            System.out.println("-----------------------");
        }
    }
}