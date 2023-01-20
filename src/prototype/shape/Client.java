package prototype.shape;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Circle circle = new Circle();
        circle.x = 2;
        circle.y = 3;
        circle.color = "red";
        circle.redius = 4;

        Circle circle_c = (Circle) circle.clone();

        System.out.println("원본 : " + circle.toString());
        System.out.println("복제 : " + circle_c.toString());

        System.out.println("---복제품 변경---");
        circle_c.x = 4;
        circle_c.color = "blue";
        circle_c.redius = 5;
        System.out.println("복제 : " + circle_c.toString());
    }

}
