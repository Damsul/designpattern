package builder.project;

public class Project {
    private final String language;
    private final String framework;
    private final String database;

    public Project(ProjectBuilder builder) {
        this.language = builder.language;
        this.framework = builder.framework;
        this.database = builder.database;
    }

    public static class ProjectBuilder {
        private String language;
        private String framework;
        private String database;

        public ProjectBuilder language(String language) {
            this.language = language;
            return this;
        }

        public ProjectBuilder framework(String framework) {
            this.framework = framework;
            return this;
        }

        public ProjectBuilder database(String database) {
            this.database = database;
            return this;
        }

        public Project build() {
            return new Project(this);
        }
    }


    @Override
    public String toString() {
        return "Project{" +
            "language='" + language + '\'' +
            ", framework='" + framework + '\'' +
            ", database='" + database + '\'' +
            '}';
    }
}
