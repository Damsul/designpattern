package prototype.shape;

public class Circle extends Shape {
    int redius;

    public Circle() {

    }

    public Circle(Circle circle) {
        super(circle);
        this.redius = circle.redius;
    }

    @Override
    double getArea() {
        return redius*redius*Math.PI;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle[" +
            "redius=" + redius +
            ", x=" + x +
            ", y=" + y +
            ", color='" + color + '\'' +
            ']';
    }
}
