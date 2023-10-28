// Concrete Subject
class TransportFactory extends TransportProducer {
    public Transport createTransport(String transportType) {
        Transport transport = new Transport(transportType);
        notify(transportType); // Notify customers about the new transport type
        return transport;
    }
}
