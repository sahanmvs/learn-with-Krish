package Builder;

public class Car {
    private final String body;
    private final boolean parkingAssist;
    private final boolean cruiseControl;
    private final int noOfAirbags;

    public Car(Builder builder) {
        this.body = builder.body;
        this.parkingAssist = builder.parkingAssist;
        this.cruiseControl = builder.cruiseControl;
        this.noOfAirbags = builder.noOfAirbags;

    }

    static class Builder {
        private String body;
        private boolean parkingAssist;
        private boolean cruiseControl;
        private int noOfAirbags;

        public Builder(String body) {
            //enforce params using the constructor
            this.body = body;
        }

        public Car build() {
            return new Car(this);
        }

        public Builder cruiseControl(boolean cruiseControl) {
            this.cruiseControl = cruiseControl;
            return this;
        }

        public Builder addAirbags(int noOfAirbags) {
            this.noOfAirbags = noOfAirbags;
            return this;
        }

        public Builder parkingAssist(boolean parkingAssist) {
            this.parkingAssist = parkingAssist;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "body='" + body + '\'' +
                ", parkingAssist=" + parkingAssist +
                ", cruiseControl=" + cruiseControl +
                ", noOfAirbags=" + noOfAirbags +
                '}';
    }
}
