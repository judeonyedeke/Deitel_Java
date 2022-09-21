package JavaWeekends;

public class Car {

    private String type;
    private int year;
    private double price;

    public Car(String type, int year, double price){
        this.type = type;
        this.year = year;
        this.price = price;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setYear(){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setPrice(){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    int carDiscount = 5;

    public double getDiscount(){

        return carDiscount /= price;
    }
}
