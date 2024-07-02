package Jour07.Job4p2;

public class VehicleManager {
    protected String vehicleModel;
    protected String dateOfPurchase;
    protected int priceOfPurchase;
    protected double currentPrice;

    public VehicleManager(String vehicleModel, String dateOfPurchase, int priceOfPurchase) {
        this.vehicleModel = vehicleModel;
        this.dateOfPurchase = dateOfPurchase;
        this.priceOfPurchase = priceOfPurchase;
    }

    public void show() {
        System.out.println("Vehicle Model: " + vehicleModel);
        System.out.println("Date of Purchase: " + dateOfPurchase);
        System.out.println("Price of Purchase: " + priceOfPurchase);
    }

    public void calculateCurrentPrice(int currentYear) {
        currentPrice = priceOfPurchase - ((currentYear - Integer.parseInt(dateOfPurchase)) * priceOfPurchase / 100);
        System.out.println("Current Price: " + currentPrice);
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
}
