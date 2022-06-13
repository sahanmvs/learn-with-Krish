package memento;

import java.util.ArrayList;
import java.util.List;

// Originator
public class PhotoEditor {
    ArrayList<Feature> features = new ArrayList<>();

    public void addFeature(Feature feature) {
        features.add(feature);
    }

    public ArrayList<Feature> getFeatures() {
        return (ArrayList) features.clone();
    }

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

        public ArrayList<Feature> getFeatures() {
            return features;
        }
    }
}
