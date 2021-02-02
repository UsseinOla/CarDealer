

package cartest;

public class Car {
    private String brandName;
    private int year;
    private int qty;
    private double price;
    public Car(String brandName, int year, int qty, double price){
        this.brandName = brandName;
        this.qty = qty < 0 ? 0 : qty;
        this.price = price < 0 ? 0 : price;
    }
    public String getBrandName(){
        return brandName;
    }
    public int getYear(){
        return year;
    }
    public int getQty(){
        return qty;
    }
    public double getPrice(){
        return price;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setQty(int qty){
        this.qty = qty < 0 ? 0 : qty;
    }
    public void setPrice(double price){
        this.price = price < 0 ? 0 : price;
    }
    public void remove(int n){
        qty -= n;
    }
    public String toString(){
       return ("Name: " + brandName + "year: " + year+ "Quantity: " + qty + " Price: " + price);//5
    }
}


