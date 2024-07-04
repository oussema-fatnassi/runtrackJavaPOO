package Jour08.Job4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Sale {
    
    Vector<Article> article = new Vector<>();
    Vector<Client> client = new Vector<>(); 
    Vector<Order> order = new Vector<>();
    Vector<Line> line = new Vector<>();

    public void placeOrder(Order order, Vector<Line> lines) {
        this.order.add(order);
        this.line.addAll(lines);
    }

    public void cancelOrder(Order order) {
        this.order.remove(order);
        this.line.removeIf(line -> line.getOrder().equals(order));
    }

    public void addArticle(Article article) {
        this.article.add(article);
    }

    public void removeArticle(Article article) {
        this.article.remove(article);
    }

    public void addClient(Client client) {
        this.client.add(client);
    }

    public void removeClient(Client client) {
        this.client.remove(client);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Sale sale = new Sale();
        int choice = -1;

        while (choice != 0) {
            System.out.println("------------- Commercial Management -------------");
            System.out.println("1. Add an article");
            System.out.println("2. Remove an article");
            System.out.println("3. Add a client");
            System.out.println("4. Remove a client");
            System.out.println("5. Place an order");
            System.out.println("6. Cancel an order");
            System.out.println("7. Display the list of articles");
            System.out.println("8. Display the list of clients");
            System.out.println("9. Display the list of orders");
            System.out.println("0. Exit");
            System.out.println("-------------------------------------------------");
            
            choice = getIntInput(sc, "Enter your choice: ");
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the reference of the article: ");
                    String reference = sc.next();
                    System.out.print("Enter the designation of the article: ");
                    String designation = sc.next();
                    double unitPrice = getDoubleInput(sc, "Enter the unit price of the article: ");
                    int stock = getIntInput(sc, "Enter the stock of the article: ");
                    Article article = new Article(reference, designation, unitPrice, stock);
                    sale.addArticle(article);
                    break;

                case 2:
                    System.out.print("Enter the reference of the article: ");
                    reference = sc.next();
                    boolean articleFound = false;
                    for (Article a : sale.article) {
                        if (a.getReference().equals(reference)) {
                            sale.removeArticle(a);
                            articleFound = true;
                            break;
                        }
                    }
                    if (!articleFound) {
                        System.out.println("Article not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter the identity of the client: ");
                    String identity = sc.next();
                    System.out.print("Enter the corporate name of the client: ");
                    String corporateName = sc.next();
                    System.out.print("Enter the address of the client: ");
                    String address = sc.next();
                    double revenue = getDoubleInput(sc, "Enter the revenue of the client: ");
                    Client client = new Client(identity, corporateName, address, revenue);
                    sale.addClient(client);
                    break;
                
                case 4:
                    System.out.print("Enter the identity of the client: ");
                    identity = sc.next();
                    boolean clientFound = false;
                    for (Client c : sale.client) {
                        if (c.getIdentity().equals(identity)) {
                            sale.removeClient(c);
                            clientFound = true;
                            break;
                        }
                    }
                    if (!clientFound) {
                        System.out.println("Client not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter the order number: ");
                    String orderNumber = sc.next();
                    System.out.print("Enter the order date: ");
                    String orderDate = sc.next();
                    System.out.print("Enter the identity of the client: ");
                    identity = sc.next();
                    clientFound = false;
                    for (Client c : sale.client) {
                        if (c.getIdentity().equals(identity)) {
                            Order order = new Order(orderNumber, orderDate, c);
                            Vector<Line> lines = new Vector<>();
                            String addMoreArticlesToOrder;
                            do {
                                System.out.print("Enter the reference of the article: ");
                                reference = sc.next();
                                articleFound = false;
                                for (Article a : sale.article) {
                                    if (a.getReference().equals(reference)) {
                                        int quantity = getIntInput(sc, "Enter the quantity: ");
                                        Line line = new Line(order, a, quantity);
                                        lines.add(line);
                                        articleFound = true;
                                        break;
                                    }
                                }
                                if (!articleFound) {
                                    System.out.println("Article not found!");
                                }
                                System.out.print("Add more articles? (yes/no): ");
                                addMoreArticlesToOrder = sc.next();
                            } while (addMoreArticlesToOrder.equalsIgnoreCase("yes"));
                            sale.placeOrder(order, lines);
                            clientFound = true;
                            break;
                        }
                    }
                    if (!clientFound) {
                        System.out.println("Client not found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter the order number: ");
                    orderNumber = sc.next();
                    boolean orderFound = false;
                    for (Order o : sale.order) {
                        if (o.getOrderNumber().equals(orderNumber)) {
                            sale.cancelOrder(o);
                            orderFound = true;
                            break;
                        }
                    }
                    if (!orderFound) {
                        System.out.println("Order not found!");
                    }
                    break;

                case 7:
                    for (Article a : sale.article) {
                        System.out.println(a.display());
                    }
                    if (sale.article.isEmpty()) {
                        System.out.println("There are no articles!");
                    }
                    break;

                case 8:
                    for (Client c : sale.client) {
                        System.out.println(c.display());
                    }
                    if (sale.client.isEmpty()) {
                        System.out.println("There are no clients!");
                    }
                    break;

                case 9:
                    for (Order o : sale.order) {
                        System.out.println("Order Number: " + o.getOrderNumber());
                        System.out.println("Order Date: " + o.getOrderDate());
                        System.out.println("Client Info: " + o.getClient().display());
                        System.out.println("Articles:");
                        for (Line l : sale.line) {
                            if (l.getOrder().equals(o)) {
                                System.out.println("    Article Reference: " + l.getArticle().getReference());
                                System.out.println("    Designation: " + l.getArticle().getDesignation());
                                System.out.println("    Unit Price: " + l.getArticle().getUnitPrice());
                                System.out.println("    Quantity: " + l.getQuantity());
                            }
                        }
                        System.out.println("-------------------------------------------------");
                    }
                    if (sale.order.isEmpty()) {
                        System.out.println("There are no orders!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        sc.close();
    }

    private static int getIntInput(Scanner sc, String prompt) {
        int input = -1;
        while (true) {
            System.out.print(prompt);
            try {
                input = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); 
            }
        }
        return input;
    }

    private static double getDoubleInput(Scanner sc, String prompt) {
        double input = -1;
        while (true) {
            System.out.print(prompt);
            try {
                input = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); 
            }
        }
        return input;
    }
}