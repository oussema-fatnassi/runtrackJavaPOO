package Jour07.Job4p1;

public class Car extends VehicleManager{
    
    private int engineCapacity;
    private int numberOfDoors;
    private int enginePower;
    private int mileage;

    public Car(String vehicleModel, String dateOfPurchase, int priceOfPurchase, int engineCapacity, int numberOfDoors, int enginePower, int mileage) {
        super(vehicleModel, dateOfPurchase, priceOfPurchase);
        this.engineCapacity = engineCapacity;
        this.numberOfDoors = numberOfDoors;
        this.enginePower = enginePower;
        this.mileage = mileage;
    }

    public void show() {
        super.show();
        System.out.println("Engine capacity: " + engineCapacity);
        System.out.println("Number of Seats: " + numberOfDoors);
        System.out.println("Engine Power: " + enginePower);
        System.out.println("Mileage: " + mileage);
    }
}
