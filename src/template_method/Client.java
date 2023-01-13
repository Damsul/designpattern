package template_method;

public class Client {

    public static void main(String[] args) {
        Professor javaProfessor = new JavaProfessor();
        javaProfessor.startLecture();
        System.out.println("---------------------");

        Professor pythonProfessor = new PythonProfessor();
        pythonProfessor.startLecture();
        System.out.println("---------------------");

        Professor osProfessor = new OsProfessor();
        osProfessor.startLecture();
    }

}
