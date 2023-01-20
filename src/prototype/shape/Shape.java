package prototype.shape;

public abstract class Shape implements Cloneable {
    int x;
    int y;
    String color;

    public Shape() {

    }

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    abstract double getArea();
}
