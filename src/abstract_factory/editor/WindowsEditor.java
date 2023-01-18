package abstract_factory.editor;

public class WindowsEditor implements Editor{
    @Override
    public Shortcut createShortCut() {
        return new WindowsShortcut();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
