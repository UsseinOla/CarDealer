package cartest;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the address: ");
        String address = scan.nextLine();
        carDealer dealer = new carDealer(address, 2);

        dealer.buyCars();

        char cont = 'y';
        do {
            System.out.print("Enter the name of the car you are looking for and the quantity you need: ");
            String brandName = scan.next();
            int qtyNeeded = scan.nextInt();
            double totalPrice = dealer.sellCars(brandName, qtyNeeded);
            if (totalPrice != -1 && totalPrice != -2) {
                System.out.println("Amount to be paid: " + totalPrice);
            }
            System.out.println("Do yu want to continue (y/n): ");
            cont = scan.next().charAt(0);
        } while (cont != 'n');
    }
}
