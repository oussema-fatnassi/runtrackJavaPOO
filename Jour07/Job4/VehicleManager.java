package Jour07.Job4;

public class VehicleManager {
    private String vehicleModel;
    private String dateOfPurchase;
    private int priceOfPurchase;
    private int currentPrice;

    public VehicleManager(String vehicleModel, String dateOfPurchase, int priceOfPurchase) {
        this.vehicleModel = vehicleModel;
        this.dateOfPurchase = dateOfPurchase;
        this.priceOfPurchase = priceOfPurchase;
    }

    public void show() {
        System.out.println("Vehicle Model: " + vehicleModel);
        System.out.println("Date of Buy: " + dateOfPurchase);
        System.out.println("Price of Buy: " + priceOfPurchase);
    }

}
