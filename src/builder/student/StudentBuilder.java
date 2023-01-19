package builder.student;

public interface StudentBuilder {

    StudentBuilder id(int id);

    StudentBuilder name(String name);

    StudentBuilder grade(String grade);

    StudentBuilder phoneNumber(String phoneNumber);

    Student build();
}
