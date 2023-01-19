package builder.student;

public class DefaultStudentBuilder implements StudentBuilder{

    private int id;
    private String name;
    private String grade;
    private String phoneNumber;

    @Override
    public StudentBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder grade(String grade) {
        this.grade = grade;
        return this;
    }

    @Override
    public StudentBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public Student build() {
        return new Student(id, name, grade, phoneNumber);
    }
}
