package flyweight.shape;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Circle> circleMap = new HashMap<>();
    private static final HashMap<String, Rectangle> rectangleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("==== 새로운 객체 생성 : " + color + "색 원 ====");
        }

        return circle;
    }

    public static Shape getRectangle(String color) {
        Rectangle rectangle = rectangleMap.get(color);

        if (rectangle == null) {
            rectangle = new Rectangle(color);
            rectangleMap.put(color, rectangle);
            System.out.println("==== 새로운 객체 생성 : " + color + "색 사각형 ====");
        }

        return rectangle;
    }

}
