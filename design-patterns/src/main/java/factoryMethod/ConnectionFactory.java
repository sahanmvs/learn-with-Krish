package factoryMethod;

public class ConnectionFactory {

    public static Connection getConnection(ConnectionCode connectionCode) {
        switch (connectionCode) {
            case FibreDoublePay:
                return new FibreDoublePay();
            case FibreTriplePay:
                return new FibreTriplePay();
            default:
                return null;
        }
    }
}
