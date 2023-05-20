package web.model;

import java.util.ArrayList;

public class Car {
    public String model;
    private String color;
    private int year;
    private double price;
    private ArrayList<Car> carList = new ArrayList<>();
    public Car(String model, String color, int year, double price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

}