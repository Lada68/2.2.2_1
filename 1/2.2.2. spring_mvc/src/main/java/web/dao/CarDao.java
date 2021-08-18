package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao implements CarDaoIf {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "mers", 1950));
        cars.add(new Car(2, "sherry", 2010));
        cars.add(new Car(3, "renault", 2021));
        cars.add(new Car(4, "peugeot", 1986));
        cars.add(new Car(5, "lada", 1992));

    }

    public List<Car> getListCars() {

        return cars;
    }

    public List<Car> show(int count) {
        List<Car> list = new ArrayList<>();
        switch (count) {
            case 1:
                list.add(cars.get(0));
                break;
            case 2:
                list.add(cars.get(0));
                list.add(cars.get(1));
                break;
            case 3:
                list.add(cars.get(0));
                list.add(cars.get(1));
                list.add(cars.get(2));
                break;
            case 4:
                list.add(cars.get(0));
                list.add(cars.get(1));
                list.add(cars.get(2));
                list.add(cars.get(3));
                break;
            default:
                list.add(cars.get(0));
                list.add(cars.get(1));
                list.add(cars.get(2));
                list.add(cars.get(3));
                list.add(cars.get(4));
                break;
        }

        return list;
    }
}
