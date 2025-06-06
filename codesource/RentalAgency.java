import java.util.ArrayList;

public class RentalAgency {
    private ArrayList<Car> cars;
    private ArrayList<Customer> customers;

    public RentalAgency() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Car findAvailableCar() {
        for (Car car : cars) {
            if (car.isAvailable()) {
                return car;
            }
        }
        return null;
    }

    public void rentCar(String customerId) {
        Car car = findAvailableCar();
        if (car != null) {
            car.rent();
            System.out.println("Car rented to customer ID: " + customerId);
        } else {
            System.out.println("No cars available for rent.");
        }
    }

    public void returnCar(String carId) {
        for (Car car : cars) {
            if (car.getCarId().equals(carId)) {
                car.returnCar();
                System.out.println("Car " + carId + " returned.");
                return;
            }
        }
        System.out.println("Car not found.");
    }

    public void listCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}