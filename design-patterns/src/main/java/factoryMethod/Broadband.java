package factoryMethod;

public class Broadband extends Service{
    public Broadband(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Broadband{" +
                "price=" + price +
                '}';
    }
}
