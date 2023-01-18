package abstract_factory.editor;

public class WindowsShortcut implements Shortcut{
    @Override
    public String copy() {
        return "Windows Copy";
    }

    @Override
    public String paste() {
        return "Windows Paste";
    }
}
