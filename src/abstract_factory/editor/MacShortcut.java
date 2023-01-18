package abstract_factory.editor;

public class MacShortcut implements Shortcut{
    @Override
    public String copy() {
        return "Mac Copy";
    }

    @Override
    public String paste() {
        return "Mac Paste";
    }
}
