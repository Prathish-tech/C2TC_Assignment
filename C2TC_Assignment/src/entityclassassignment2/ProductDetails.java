package entityclassassignment2;

import java.util.Scanner;

public class ProductDetails {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Products[] products = new Products[3];

	        for (int i = 0; i < 3; i++) {
	            products[i] = new Products();
	            System.out.println("Enter details for Product " + (i + 1) + ":");
	            System.out.print("Id: ");
	            products[i].setId(scanner.nextInt());
	            scanner.nextLine(); 
	            System.out.print("ProductName   : ");
	            products[i].setProductName(scanner.nextLine());
	            System.out.print("Price    : ");
	            products[i].setPrice(scanner.nextInt());
	            scanner.nextLine();
	            System.out.println();
	        }

	        System.out.println("=== Student Details ===");
	        for (Products product : products) {
	            Products.displayDetails();
	        }

	        scanner.close();

	}

}
