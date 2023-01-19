package builder.student;

public class Client {

    public static void main(String[] args) {
        StudentDirector school = new StudentDirector(new DefaultStudentBuilder());
        Student s = school.student();
        System.out.println("student : " + s.toString());


        Student student = Student.builder()
            .id(123)
            .name("st")
            .grade("2학년")
            .phoneNumber("010-3333-4444")
            .build();
        System.out.println("student : " + student.toString());
    }

}
