package template_method;

public class JavaProfessor extends Professor {
    @Override
    public void teach() {
        System.out.println("교수님의 자바 강의가 시작됩니다.");
    }
}
