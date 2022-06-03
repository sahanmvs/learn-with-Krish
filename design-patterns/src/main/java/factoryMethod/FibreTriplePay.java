package factoryMethod;

public class FibreTriplePay extends Connection{
    @Override
    protected void getConnection() {
        services.add(new Telephone(2500));
        services.add(new Broadband(10000));
        services.add(new TV(7500));
    }
}
