package Jour08.Job4;

public class Line {
    
    private Order order;
    private Article article;
    private int quantity;

    public Line(Order order, Article article, int quantity){
        this.order = order;
        this.article = article;
        this.quantity = quantity;
    }

    public void setOrder(Order order){
        this.order = order;
    }

    public void setArticle(Article article){
        this.article = article;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public Order getOrder(){
        return this.order;
    }

    public Article getArticle(){
        return this.article;
    }

    public int getQuantity(){
        return this.quantity;
    }
}