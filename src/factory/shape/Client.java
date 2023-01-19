package factory.shape;

public class Client {
    public static void main(String[] args) {
        Factory factory = new ShapeFactory();

        Shape circle = factory.makeShape("CIRCLE");
        Shape square = factory.makeShape("SQUARE");
        Shape rectangle = factory.makeShape("RECTANGLE");

        System.out.println(circle.getName());
        System.out.println(square.getName());
        System.out.println(rectangle.getName());
    }
}
