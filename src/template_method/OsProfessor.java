package template_method;

public class OsProfessor extends Professor {
    @Override
    public void teach() {
        System.out.println("교수님의 운영체제 강의가 시작됩니다.");
    }
}
