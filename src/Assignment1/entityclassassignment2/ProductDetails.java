package Assignment1.entityclassassignment2;

public class ProductDetails {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(1);
        p1.setProductName("Heater");
        p1.setPrice(5000);
        System.out.println(p1);
        
        Product p2 = new Product();
        p2.setId(2);
        p2.setProductName("Cooler");
        p2.setPrice(10000);
        System.out.println(p2);
        
        Product p3 = new Product();
        p3.setId(3);
        p3.setProductName("Dryer");
        p3.setPrice(5000);
        System.out.println(p3);
        }
    }