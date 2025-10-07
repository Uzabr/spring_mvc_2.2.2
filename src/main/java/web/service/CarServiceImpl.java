package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = List.of(
            new Car("BMW", 450, 280),
            new Car("Porche", 450, 300),
            new Car("Honda", 250, 200),
            new Car("Ferrari", 750, 380),
            new Car("Mazda", 250, 200),
            new Car("Bugatti", 1200, 400),
            new Car("Opel", 150, 180)
    );

    @Override
    public List<Car> getCars(Integer count) {
        int limit = (count == null || count <= 0 || count >= 5) ? 5 : count;
        int k = Math.min(limit, cars.size());
        return cars.subList(0, k);
    }




}
