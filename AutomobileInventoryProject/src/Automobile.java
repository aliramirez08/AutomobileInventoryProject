import java.io.FileWriter;
import java.io.IOException;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

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
