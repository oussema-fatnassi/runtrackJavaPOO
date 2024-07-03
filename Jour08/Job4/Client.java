package Jour08.Job4;

public class Client extends Person {
    
    private double revenue;

    public Client(String identity, String corporateName, String address, double revenue){
        super(identity, corporateName, address);
        this.revenue = revenue;
    }

    public void setRevenue(double revenue){
        this.revenue = revenue;
    }

    public double getRevenue(){
        return this.revenue;
    }

    public String display(){
        return super.display() + "\nRevenue: " + this.revenue;
    }
}