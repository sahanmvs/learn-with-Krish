package factoryMethod;

public class FibreDoublePay extends Connection{
    @Override
    protected void getConnection() {
        services.add(new Telephone(2500));
        services.add(new Broadband(10000));
    }
}
