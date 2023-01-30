package flyweight.shape;

public class Rectangle implements Shape {

    private String color;
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(
            "Rectangle [color=" + color + ", x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]");
    }
}
