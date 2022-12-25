/*Create a class “Vehicle” with instance variable vehicle_type. Inherit the class in a
class called “Car” with instance model_type, company name etc. display the
information of the vehicle by defining the display() in both super and sub class [Method Overriding]
*/
class Vehicle {
    private String vehicleType;

    public Vehicle() {
        vehicleType = "undefine";
    }

    public Vehicle(String vt) {
        this.vehicleType = vt;
    }

    public String getVehicleType() {
        return (this.vehicleType);
    }

    public void setVehicleType(String vt) {
        this.vehicleType = vt;
    }

    public void display() {
        System.out.println("Vehicle Information : ");
        System.out.println("Type : " + this.getVehicleType());
    }
}

class Car extends Vehicle {
    private String modelType;
    private String companyName;

    public Car() {
        super("car");
        modelType = "undefine";
        companyName = "undefine";
    }

    public Car(String m, String c) {
        super("car");
        modelType = m;
        companyName = c;
    }

    @Override
    public void display() 
    {
        System.out.println("=====================================");
        System.out.println("Vehicle Information : ");
        System.out.println("Type    : " + this.getVehicleType());
        System.out.println("Model   : " + this.modelType);
        System.out.println("Company : " + this.companyName);
        System.out.println("=====================================");
    }
}

public class pr18 {
    public static void main(String args[]) {
        Car c = new Car("Nexon", "TATA");
        c.display();
        Car c1 = new Car("Omni", "Maruti");
        c1.display();
    }
}
