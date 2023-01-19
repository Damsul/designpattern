package builder.project;

import builder.project.Project.ProjectBuilder;

public class ProjectDirector {

    public Project javaProject() {
        return new Project.ProjectBuilder()
            .language("Java")
            .framework("Springframework")
            .database("MySQL")
            .build();
    }

}
