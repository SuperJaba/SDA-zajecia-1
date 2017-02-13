package zajecia.dziewiate;

import java.util.ArrayList;

/**
 * Created by robot on 2017-02-11.
 */
public class Car {
   private String producer;
   private String model;
   private String colour;
   private int numberOfDoors;
   private String body;
   private String transmition;
   private int yearOfProduction;
   private double engineCapacity;
   private int price;
   private int mileage;

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", body='" + body + '\'' +
                ", transmition='" + transmition + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", price=" + price +
                ", mileage=" + mileage +
                '}';
    }

    public String getProducer() {
        return producer;
    }



    public String getModel() {
        return model;
    }


    public String getColour() {
        return colour;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }


    public String getBody() {
        return body;
    }


    public String getTransmition() {
        return transmition;
    }


    public int getYearOfProduction() {
        return yearOfProduction;
    }


    public double getEngineCapacity() {
        return engineCapacity;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String producer, String model, int yearOfProduction, double engineCapacity, int price, int mileage) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.price = price;
        this.mileage = mileage;
    }

    public Car(String producer, String model, String colour, int numberOfDoors, String body, String transmition, int yearOfProduction, double engineCapacity, int price, int mileage) {
        this.producer = producer;
        this.model = model;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
        this.body = body;
        this.transmition = transmition;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.price = price;
        this.mileage = mileage;
    }

    public Car() {
    }
}

