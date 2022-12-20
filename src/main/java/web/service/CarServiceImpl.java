package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = List.of(
            new Car("BMW", "X7", 7_500_000.0),
            new Car("Audi", "Q8", 4_000_000.0),
            new Car("KIA", "K8", 3_500_000.0),
            new Car("Lexus", "RX350", 2_150_000.0),
            new Car("Volkswagen", "Tiguan", 3_375_900.0)
    );

    @Override
    public List<Car> getSomeCars(Integer count) {
        // Return all cars in edge cases
        if (count == null || count < 1) {
            return cars;
        }

        return cars.stream().limit(count).toList();
    }
}
