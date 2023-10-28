// Factory Pattern

// Product: Transport (Product Interface)
class Transport {
    private String transportType;

    public Transport(String transportType) {
        this.transportType = transportType;
    }

    public void transportInfo() {
        // Implementation specific to each transport type
    }
}