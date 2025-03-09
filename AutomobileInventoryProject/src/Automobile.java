import java.io.FileWriter;
import java.io.IOException;

/**
 * The Automobile class represents a vehicle with basic attributes such as
 * make, model, color, year, and mileage.
 * It includes methods to add, update, remove, list, and save vehicle details.
 */
public class Automobile {
    // Private attributes for vehicle details
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    /**
     * Default constructor initializes vehicle attributes to default values.
     */
    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    /**
     * Parameterized constructor initializes the vehicle with provided values.
     * @param make The brand of the vehicle.
     * @param model The model of the vehicle.
     * @param color The color of the vehicle.
     * @param year The manufacturing year of the vehicle.
     * @param mileage The mileage of the vehicle.
     */
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    /**
     * Adds a new vehicle by setting its attributes.
     * @return Success or failure message.
     */
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle successfully added.";
        } catch (Exception e) {
            return "Error: Unable to add vehicle.";
        }
    }

    /**
     * Lists vehicle details in a string array format.
     * @return An array containing vehicle information.
     */
    public String[] listVehicle() {
        try {
            return new String[]{
                "Make: " + make,
                "Model: " + model,
                "Color: " + color,
                "Year: " + year,
                "Mileage: " + mileage
            };
        } catch (Exception e) {
            return new String[]{"Error: Unable to retrieve vehicle details."};
        }
    }

    /**
     * Removes vehicle details by resetting attributes to default values.
     * @return Success or failure message.
     */
    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed successfully.";
        } catch (Exception e) {
            return "Error: Unable to remove vehicle.";
        }
    }

    /**
     * Updates vehicle details with new values.
     * @return Success or failure message.
     */
    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle information updated successfully.";
        } catch (Exception e) {
            return "Error: Unable to update vehicle.";
        }
    }

    /**
     * Saves vehicle details to a specified file.
     * @param filePath The file path where vehicle details should be saved.
     * @return Success or failure message.
     */
    public String saveToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Make: " + make + "\n");
            writer.write("Model: " + model + "\n");
            writer.write("Color: " + color + "\n");
            writer.write("Year: " + year + "\n");
            writer.write("Mileage: " + mileage + "\n");
            return "Vehicle information successfully saved to file.";
        } catch (IOException e) {
            return "Error: Unable to save file.";
        }
    }
}
