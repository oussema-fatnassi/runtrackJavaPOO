package Jour07.Job4p2;

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

    @Override
    public void calculateCurrentPrice(int currentYear) {

        int age = currentYear - Integer.parseInt(dateOfPurchase);
        double depreciationByAge = 1 - (age * 0.02);
        currentPrice = priceOfPurchase * depreciationByAge;

        int roundedMileage = (int) Math.round(mileage / 10000.0);
        double depreciationByMileage = 1 - (roundedMileage * 0.05);
        currentPrice = currentPrice * depreciationByMileage;

        if (vehicleModel.equals("Renault Clio") || vehicleModel.equals("Fiat") || vehicleModel.equals("Honda")) {
            currentPrice *= 0.9;
        }
        else if (vehicleModel.equals("Ferrari") || vehicleModel.equals("Porsche") || vehicleModel.equals("Maserati")) {
            currentPrice *= 0.8;
        }

        if(currentPrice < 0) {
            currentPrice = 0;
        }
        
        System.out.println("Current Price: " + currentPrice);
    }
}
