package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDaoIf {
    public List<Car> getListCars();

    public List<Car> show(int count);
}
