package flyweight.shape;

public class Client {

    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colors[(int) (Math.random() * 4)]);
            circle.setX((int) (Math.random() * 100));
            circle.setY((int) (Math.random() * 4));
            circle.setRadius((int) (Math.random() * 10));
            circle.draw();
        }

        System.out.println("\n사각형 생성");
        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = (Rectangle) ShapeFactory.getRectangle(colors[(int) (Math.random() * 4)]);
            rectangle.setX((int) (Math.random() * 50));
            rectangle.setY((int) (Math.random() * 50));
            rectangle.setWidth((int) (Math.random() * 50));
            rectangle.setHeight((int) (Math.random() * 50));
            rectangle.draw();
        }
    }
}
