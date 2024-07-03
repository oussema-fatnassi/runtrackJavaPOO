package Jour08.Job4;

public class Order {
    
    private String orderNumber;
    private String orderDate;
    private Client client;

    public Order(String orderNumber, String orderDate, Client client){
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.client = client;
    }

    public void setOrderNumber(String orderNumber){
        this.orderNumber = orderNumber;
    }

    public void setOrderDate(String orderDate){
        this.orderDate = orderDate;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public String getOrderNumber(){
        return this.orderNumber;
    }

    public String getOrderDate(){
        return this.orderDate;
    }

    public Client getClient(){
        return this.client;
    }
}