import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        try {
            Automobile car = new Automobile("Toyota", "Camry", "Blue", 2020, 35000);
            System.out.println("Vehicle Added: ");
            printVehicleDetails(car);

            System.out.println("\nRemoving vehicle...");
            System.out.println(car.removeVehicle());

            System.out.println("\nVehicle after removal:");
            printVehicleDetails(car);

            System.out.println("\nAdding a new vehicle...");
            System.out.println(car.addVehicle("Honda", "Civic", "Red", 2022, 15000));

            System.out.println("\nUpdated vehicle details:");
            printVehicleDetails(car);

            System.out.println("\nUpdating vehicle details...");
            System.out.println(car.updateVehicle("Ford", "Mustang", "Black", 2023, 5000));

            System.out.println("\nVehicle after update:");
            printVehicleDetails(car);

            Scanner scanner = new Scanner(System.in);
            System.out.print("\nWould you like to save the vehicle information to a file? (Y/N): ");
            String response = scanner.nextLine().trim().toUpperCase();

            if (response.equals("Y")) {
                String filePath = "C:\\Temp\\Autos.txt"; 
                System.out.println(car.saveToFile(filePath));
            } else {
                System.out.println("File will not be saved.");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error encountered in the inventory system.");
        }
    }

    public static void printVehicleDetails(Automobile car) {
        for (String info : car.listVehicle()) {
            System.out.println(info);
        }
    }
}
