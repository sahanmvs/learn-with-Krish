package factoryMethod;

public class Telephone extends Service{
    public Telephone(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "price=" + price +
                '}';
    }
}
