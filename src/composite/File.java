package composite;

public class File implements FileSystem{
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void info() {
        System.out.println("file name : " + this.name + ", file size : " + this.size);
    }
}
