package Builder;

public class BuilderApp {
    public static void main(String[] args) {
        Telescoping telescoping = new Telescoping("SUV-R");
        System.out.println(telescoping);

        Car.Builder builder = new Car.Builder("Saloon-L");
        Car car1 = builder.parkingAssist(true).addAirbags(2).build();
        System.out.println(car1);
    }
}
