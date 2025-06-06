import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalAgency agency = new RentalAgency();

        
        agency.addCar(new Car("KDQ1", "Cardillac Escarlate"));

        agency.addCar(new Car("KDQ2", "Dodge Helicat"));

                      agency.addCustomer(new Customer("0001", "FILEX"));

        agency.addCustomer(new Customer("0002", "KIM"));

        System.out.println("=== Welcome to the Car Rental System ===");
        int option;

        do {
            System.out.println("\n1. View Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            option = scanner.nextInt();
            
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    agency.listCars();
                    break;
                case 2:
                    System.out.print("Enter Customer ID: ");
                    String custId = scanner.nextLine();
                    agency.rentCar(custId);
                    break;
                case 3:
                    System.out.print("Enter Car ID to return: ");
                    String carId = scanner.nextLine();
                    agency.returnCar(carId);
                    break;
                case 4:
                    System.out.println("Exiting system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 4);

        scanner.close();
    }
}