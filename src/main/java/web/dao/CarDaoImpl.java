package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "Black", 2012));
        carList.add(new Car("Dodge", "Red", 2003));
        carList.add(new Car("Cadillac", "Grey", 2019));
        carList.add(new Car("Belarus", "Blue", 1999));
        carList.add(new Car("Audi", "White", 2017));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return (count >= 0) ? carList.subList(0, Math.min(count, carList.size())) : carList;
    }
}
