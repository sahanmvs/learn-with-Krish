package Builder;

public class Telescoping {
    private String body;
    private boolean parkingAssist;
    private boolean cruiseControl;
    private int noOfAirbags;

    public Telescoping(String body) {
        this.body = body;
    }

    public Telescoping(String body, boolean parkingAssist) {
        this(body);
        this.parkingAssist = parkingAssist;
    }

    public Telescoping(String body, boolean parkingAssist, boolean cruiseControl) {
        this(body, parkingAssist);
        this.cruiseControl = cruiseControl;
    }

    public Telescoping(String body, boolean parkingAssist, boolean cruiseControl, int noOfAirbags) {
        this(body, parkingAssist, cruiseControl);
        this.noOfAirbags = noOfAirbags;
    }

    @Override
    public String toString() {
        return "Telescoping{" +
                "body='" + body + '\'' +
                ", parkingAssist=" + parkingAssist +
                ", cruiseControl=" + cruiseControl +
                ", noOfAirbags=" + noOfAirbags +
                '}';
    }
}
