package memento;

import java.util.Stack;

// Caretaker
public class History {
    Stack<PhotoEditor.PhotoEditorMemento> history = new Stack<>();

    public void save(PhotoEditor photoEditor) {
        history.push(photoEditor.save());
    }

    public void undo(PhotoEditor photoEditor) {
        if(!history.isEmpty())
            photoEditor.undo(history.pop());
        else
            System.out.println("Can't undo");
    }
}
