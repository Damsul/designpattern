package composite;

public interface FileSystem {

    String getName();

    int getSize();

    void info();

    void rename(String name);
}
