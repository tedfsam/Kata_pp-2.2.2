package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private CarDao cars;

    @Autowired
    public CarServiceImpl(CarDao cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.getCarsList(count);
    }
}
