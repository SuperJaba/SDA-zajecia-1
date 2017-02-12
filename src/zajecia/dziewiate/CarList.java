package zajecia.dziewiate;

import java.util.ArrayList;

/**
 * Created by robot on 2017-02-11.
 */
public class CarList {
    private ArrayList<Car> cars;

    public CarList() {
        this.cars = new ArrayList<>();
    }

   public void add(Car car) {
        this.cars.add(car);
   }

    public ArrayList<Car> getCarFromPrice(int price) {
        ArrayList<Car> tempCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPrice() >= price) {
                tempCars.add(car);
            }
        }
        return tempCars;
    }

}
