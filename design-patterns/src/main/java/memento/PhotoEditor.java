package memento;

import java.util.ArrayList;
import java.util.List;

// Originator
public class PhotoEditor {
    // Define ArrayList to directly implement the clone()
    ArrayList<Feature> features = new ArrayList<>();

    public void addFeature(Feature feature) {
        features.add(feature);
    }

    public ArrayList<Feature> getFeatures() {
        // use clone() to avoid modifications to the original list
        // clone() returns an object, so we need to cast
        return (ArrayList) features.clone();
    }

    // if we return PhotoEditor object we can't add more features without affecting previous state
    //return PhotoEditorMemento to the caretaker
    public PhotoEditorMemento save() {
        // creating mementos for originator class
        // passing originator state to memento via constructor
        return new PhotoEditorMemento(getFeatures());
    }

    public void undo(PhotoEditorMemento memento) {
        features = memento.getFeatures();
    }

    @Override
    public String toString() {
        return "PhotoEditor{" +
                "features=" + features +
                '}';
    }

    static class PhotoEditorMemento {
        ArrayList<Feature> features;

        // No setters, Memento class is immutable
        public PhotoEditorMemento(ArrayList<Feature> features) {
            this.features = features;
        }

        // private method, only the originator can access, no revealing of object implementation
        private ArrayList<Feature> getFeatures() {
            return features;
        }
    }
}
