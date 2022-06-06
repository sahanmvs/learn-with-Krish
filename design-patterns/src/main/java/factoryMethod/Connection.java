package factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Connection {
    protected List<Service> services = new ArrayList<>();

    public Connection() {
        getConnection();
    }

    protected abstract void getConnection();

    public Double getTotalPrice() {
        Double total = services.stream()
                        .map(service -> service.getPrice())
                        .reduce(0.0, Double::sum);
        return total;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "services=" + services +
                '}';
    }

}
