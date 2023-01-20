package prototype.music;

public class Music implements Cloneable {
    private String name;
    private String title;

    public Music(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Music music = (Music) super.clone();
        music.title = this.title + "_복제품";
        return music;
    }

    @Override
    public String toString() {
        return name + " - " + title;
    }
}
