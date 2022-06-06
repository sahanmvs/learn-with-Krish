package factoryMethod;

public class FactoryApp {
    public static void main(String[] args) {
        Connection connection =
                ConnectionFactory.getConnection(ConnectionCode.FibreDoublePay);
        System.out.println(connection);
        System.out.println(connection.getTotalPrice());
    }
}



