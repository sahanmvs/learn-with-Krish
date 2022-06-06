package factoryMethod;

public class TV extends Service{
    public TV(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "TV{" +
                "price=" + price +
                '}';
    }
}
