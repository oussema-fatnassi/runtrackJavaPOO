package Jour08.Job4;

public class Article {
    
    private String reference;
    private String designation;
    private double unitPrice;
    private int stock;

    public Article(String reference, String designation, double unitPrice, int stock){
        this.reference = reference;
        this.designation = designation;
        this.unitPrice = unitPrice;
        this.stock = stock;
    }

    public void setReference(String reference){
        this.reference = reference;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public String getReference(){
        return this.reference;
    }

    public String getDesignation(){
        return this.designation;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    public int getStock(){
        return this.stock;
    }

    public String display(){
        return "-------------------------------------------------" +
                "\nReference: " + this.reference + 
                "\nDesignation: " + this.designation + 
                "\nUnit Price: " + this.unitPrice + 
                "\nStock: " + this.stock +
                "\n-------------------------------------------------";
    }
}