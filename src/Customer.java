// Observer: Customer (Observer)
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void update(String transportType) {
        System.out.println(name + " received a notification: New transport type '" + transportType + "' is available.");
    }
}