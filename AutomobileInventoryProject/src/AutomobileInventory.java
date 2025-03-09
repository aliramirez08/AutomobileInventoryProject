import java.util.Scanner;

/**
 * The AutomobileInventory class is the main program that interacts with the Automobile class.
 * It performs operations like adding, removing, updating, and listing vehicle details.
 */
public class AutomobileInventory {
    public static void main(String[] args) {
        try {
            // Create a new Automobile object with initial values
            Automobile car = new Automobile("Toyota", "Camry", "Blue", 2020, 35000);
            
            // Display vehicle details after creation
            System.out.println("Vehicle Added: ");
            printVehicleDetails(car);

            // Remove vehicle details
            System.out.println("\nRemoving vehicle...");
            System.out.println(car.removeVehicle());

            // Display vehicle details after removal
            System.out.println("\nVehicle after removal:");
            printVehicleDetails(car);

            // Add a new vehicle
            System.out.println("\nAdding a new vehicle...");
            System.out.println(car.addVehicle("Honda", "Civic", "Red", 2022, 15000));

            // Display updated vehicle details
            System.out.println("\nUpdated vehicle details:");
            printVehicleDetails(car);

            // Update the vehicle details with new values
            System.out.println("\nUpdating vehicle details...");
            System.out.println(car.updateVehicle("Ford", "Mustang", "Black", 2023, 5000));

            // Display vehicle details after update
            System.out.println("\nVehicle after update:");
            printVehicleDetails(car);

            // Prompt user for file save option
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nWould you like to save the vehicle information to a file? (Y/N): ");
            String response = scanner.nextLine().trim().toUpperCase();

            // Save vehicle details to file if the user chooses "Y"
            if (response.equals("Y")) {
                String filePath = "C:\\Temp\\Autos.txt"; // Ensure this directory exists before running
                System.out.println(car.saveToFile(filePath));
            } else {
                System.out.println("File will not be saved.");
            }

            // Close the scanner to prevent memory leaks
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error encountered in the inventory system.");
        }
    }

    /**
     * Helper method to print vehicle details to the console.
     * @param car The Automobile object whose details are to be printed.
     */
    public static void printVehicleDetails(Automobile car) {
        for (String info : car.listVehicle()) {
            System.out.println(info);
        }
    }
}
