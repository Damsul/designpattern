package builder.project;

public class Client {

    public static void main(String[] args) {
        Project project = new Project.ProjectBuilder()
            .language("python")
            .database("Django")
            .database("MongoDB")
            .build();

        ProjectDirector director = new ProjectDirector();
        Project javaProject = director.javaProject();

        System.out.println("파이썬 : " + project.toString());
        System.out.println("자바 : " + javaProject.toString());

    }

}
