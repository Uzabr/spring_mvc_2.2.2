package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = List.of(
            new Car("BMW", 450, 280),
            new Car("Porche", 450, 300),
            new Car("Honda", 250, 200),
            new Car("Ferrari", 750, 380),
            new Car("Mazda", 250, 200),
            new Car("Bugatti", 1200, 400),
            new Car("Opel", 150, 180)
    );

    public List<Car> getCars(int count) {
        int k = Math.min(Math.max(count, 0), cars.size());
        return cars.subList(0, k);
    }

    public List<Car> getCars() {
        return cars;
    }

}
