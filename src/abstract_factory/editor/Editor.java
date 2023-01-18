package abstract_factory.editor;

public interface Editor {
    Shortcut createShortCut();
    Menu createMenu();
}
