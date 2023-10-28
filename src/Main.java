import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConcreteTransportFactory factory = new ConcreteTransportFactory();
        TransportProducer producer = new TransportFactory();

        // Create customer objects and attach them to the producer
        Customer customer1 = new Customer("Customer 1");
        Customer customer2 = new Customer("Customer 2");

        producer.attach(customer1);
        producer.attach(customer2);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the type of transport (car/bicycle) or type 'exit' to end: ");

            String transportType = scanner.nextLine();
            customer1.update(transportType);
            customer2.update(transportType);
            if (transportType.equals("exit")) {
                System.out.println("Exiting the program.");
                break; // Exit the loop and end the program
            }

            Transport newTransport = factory.createTransport(transportType);
        }

        scanner.close();

    }
}

