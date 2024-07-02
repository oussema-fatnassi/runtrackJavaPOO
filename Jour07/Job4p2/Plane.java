package Jour07.Job4p2;

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

    @Override
    public void calculateCurrentPrice(int currentYear) {

        if (engineType.equals("Propeller")){
            int roundedHours = (int) Math.round(numberOfFlightHours / 100.0);
            double depreciationByHours = 1 - (roundedHours * 0.1);
            currentPrice = priceOfPurchase * depreciationByHours;
        }
        else{
            int roundedHours = (int) Math.round(numberOfFlightHours / 1000.0);
            double depreciationByHours = 1 - (roundedHours * 0.2);
            currentPrice = priceOfPurchase * depreciationByHours;
        }

        if(currentPrice < 0) {
            currentPrice = 0;
        }
        
        System.out.println("Current Price: " + currentPrice);
    }
}