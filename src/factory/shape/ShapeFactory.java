package factory.shape;

public class ShapeFactory implements Factory{
    @Override
    public Shape makeShape(String shape) {
        switch (shape) {
            case "CIRCLE":
                return new CircleShape();
            case "SQUARE":
                return new SquareShape();
            case "RECTANGLE":
                return new RectangleShape();
        }
        throw new IllegalArgumentException("Non-exist shape");
    }
}
