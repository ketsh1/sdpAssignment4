# sdpAssignment4
# Transport Production with Observer and Factory Patterns

This Java project demonstrates the use of the Observer and Factory design patterns in a transport production scenario. It allows you to create various types of transport and notifies customers when new transport types are created.

## Factory Method
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
## Observer Design Pattern
Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

```java
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
```

```java
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

```

## How to run
```shell
https://github.com/ketsh1/sdpAssignment4
```


