import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Observer Pattern

// Subject: TransportProducer (Publisher)
class TransportProducer {
    private List<Customer> observers = new ArrayList<>();

    public void attach(Customer observer) {
        observers.add(observer);
    }

    public void detach(Customer observer) {
        observers.remove(observer);
    }

    public void notify(String transportType) {
        for (Customer observer : observers) {
            observer.update(transportType);
        }
    }
}
