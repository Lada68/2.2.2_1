package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoIf;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    @Autowired
    private CarDaoIf carDaoIf;

    @Override
    public List<Car> getListCars() {
        return carDaoIf.getListCars();
    }

    @Override
    public List<Car> show(int count) {
        return carDaoIf.show(count);
    }
}
