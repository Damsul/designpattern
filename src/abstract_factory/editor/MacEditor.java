package abstract_factory.editor;

public class MacEditor implements Editor{
    @Override
    public Shortcut createShortCut() {
        return new MacShortcut();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
