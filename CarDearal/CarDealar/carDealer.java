package cartest;
import java.util.Scanner;
public class carDealer {
private Car[] cars;
    private String address;
    public carDealer(String address, int capacity){
        this.address = address;
        cars = new Car[capacity];
    }
    public void buyCars(){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < cars.length; i++){
            System.out.println("car"+ (i+1)+":");
            System.out.println("Enter the name, year, quantity and price of a car: ");
            String name = scan.next();
            int year = scan.nextInt();
            int qty = scan.nextInt();
            double price = scan.nextDouble();
            cars[i] = new Car(name, year, qty, price);
        }
    }
    public double sellCars(String carName, int qtyNeeded){
        double totalPrice = 0;
        for(int i = 0; i < cars.length; i++)
            if(cars[i].getBrandName().equals(carName)){
                if(qtyNeeded <= cars[i].getQty()){
                    totalPrice = cars[i].getPrice() * qtyNeeded;
                    cars[i].remove(qtyNeeded);
                    return totalPrice;
                }
                else{
                    System.out.println("The requested quantity is not available!");
                    return -2;
                }
            }
        System.out.println("The car you requested is not available!"); 
        return -1;
    }
}

