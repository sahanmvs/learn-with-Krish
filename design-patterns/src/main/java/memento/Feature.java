package memento;

public class Feature {
    private String feature;

    public Feature(String feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "feature='" + feature + '\'' +
                '}';
    }
}
