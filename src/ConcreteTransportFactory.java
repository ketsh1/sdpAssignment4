// Concrete Factory
class ConcreteTransportFactory implements TransportCreate {
    public Transport createTransport(String transportType) {
        if (transportType.equals("car")) {
            return new Car(transportType);
        } else if (transportType.equals("bicycle")) {
            return new Bicycle(transportType);
        } else {
            throw new IllegalArgumentException("Invalid transport type.");
        }
    }
}
