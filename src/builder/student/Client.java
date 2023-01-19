package builder.student;

public class Client {

    public static void main(String[] args) {
        StudentDirector school = new StudentDirector(new DefaultStudentBuilder());
        Student s = school.student();
        System.out.println("student : " + s.toString());

        StudentBuilder builder = new DefaultStudentBuilder();
        Student student1 = builder.id(2323)
            .name("asdas")
            .grade("3학년")
            .phoneNumber("010-4444-5555")
            .build();


        Student student = Student.builder()
            .id(123)
            .name("st")
            .grade("2학년")
            .phoneNumber("010-3333-4444")
            .build();
        System.out.println("student : " + student.toString());
    }

}
