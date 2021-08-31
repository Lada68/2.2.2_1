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
        return cars.stream().limit(count).collect(Collectors.toList());
}
