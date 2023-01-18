package abstract_factory.editor;

public class Client {

    public static void main(String[] args) {
        Editor windowsEditor = new WindowsEditor();
        System.out.println("Copy : " + windowsEditor.createShortCut().copy());
        System.out.println("Paste : " + windowsEditor.createShortCut().paste());
        System.out.println("Save : " + windowsEditor.createMenu().save());
        System.out.println("--------------------");
        Editor macEditor = new MacEditor();
        System.out.println("Copy : " + macEditor.createShortCut().copy());
        System.out.println("Paste : " + macEditor.createShortCut().paste());
        System.out.println("Save : " + macEditor.createMenu().save());
    }

}
