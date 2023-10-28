// Concrete Products: Car, Bicycle, etc. (Concrete Implementations of Products)
class Car extends Transport {
    public Car(String transportType) {
        super(transportType);
    }

    public void transportInfo() {
        System.out.println("This is a car.");
    }
}

class Bicycle extends Transport {
    public Bicycle(String transportType) {
        super(transportType);
    }

    public void transportInfo() {
        System.out.println("This is a bicycle.");
    }
}
