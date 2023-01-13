package template_method;

public abstract class Professor {
    public void startLecture() {
        goIn();
        comeInProfessor();
        attendance();
        teach();
        goOutProfessor();
        goOut();
    }

    private void goOut() {
        System.out.println("강의실에서 나옵니다.");
    }

    private void goOutProfessor() {
        System.out.println("교수님이 강의를 마치시고 강의실을 나갑니다.");
    }

    public abstract void teach();

    private void attendance() {
        System.out.println("교수님이 출석체크를 하십니다.");
    }

    private void comeInProfessor() {
        System.out.println("교수님이 강의실로 들어옵니다.");
    }

    private void goIn() {
        System.out.println("강의실로 들어갑니다.");
    }
}
