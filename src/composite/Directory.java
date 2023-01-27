package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private List<FileSystem> child = new ArrayList<>();

    private String name;

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        child.add(fileSystem);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;

        for (FileSystem file : child) {
            size += file.getSize();
        }

        return size;
    }

    @Override
    public void info() {
        System.out.println("dir name : " + this.name);
        System.out.println("----------------------------start dir: " + this.name);
        for (FileSystem file : child) {
            file.info();
        }
        System.out.println("============================end dir: " + this.name);
        System.out.println();
    }


}
