package memento;

public class PhotoEditorApplication {
    public static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();
        History history = new History();

        photoEditor.addFeature(new Feature("filter"));
        photoEditor.addFeature(new Feature("crop"));
        history.save(photoEditor);
        System.out.println(photoEditor);

        photoEditor.addFeature(new Feature("Text"));
        //history.save(photoEditor); // if last feature is saved, getting the same
        System.out.println(photoEditor);

        history.undo(photoEditor);
        System.out.println(photoEditor);
    }
}
