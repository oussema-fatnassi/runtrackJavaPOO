package Jour07.Job4p1;

public  class Plane extends VehicleManager{

    private String engineType;
    private int numberOfFlightHours;

    public Plane(String vehicleModel, String dateOfPurchase, int priceOfPurchase, String engineType, int numberOfFlightHours) {
        super(vehicleModel, dateOfPurchase, priceOfPurchase);
        this.engineType = engineType;
        this.numberOfFlightHours = numberOfFlightHours;
    }

    public void show() {
        super.show();
        System.out.println("Engine Type: " + engineType);
        System.out.println("Number of Flight Hours: " + numberOfFlightHours);
    }
}