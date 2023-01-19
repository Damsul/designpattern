package builder.student;

public class StudentDirector {

    private final StudentBuilder studentBuilder;

    public StudentDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student student() {
        return studentBuilder.id(1234)
            .name("damsul")
            .grade("1학년")
            .phoneNumber("010-1111-2222")
            .build();
    }
}
