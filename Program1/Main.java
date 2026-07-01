package Program1;

import java.util.Scanner;

class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;

        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }

        if (stockQuantity < 0) {
            this.stockQuantity = 0;
        } else {
            this.stockQuantity = stockQuantity;
        }
    }

 
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

  
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            this.stockQuantity = 0;
        } else {
            this.stockQuantity = stockQuantity;
        }
    }

    
    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product ID: ");
        String productId = sc.nextLine();
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();
        System.out.println("Enter product price: ");
        double price = sc.nextDouble();
        System.out.println("Enter stock quantity: ");
        int stockQuantity = sc.nextInt();
        System.out.println("Enter discount percentage: ");
        double discount = sc.nextDouble();

        
        Product p = new Product(productId, productName, price, stockQuantity);

  
        p.applyDiscount(discount);

        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());

        sc.close();
    }
}