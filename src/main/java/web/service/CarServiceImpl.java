package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(int numberOfCars, List<Car> carsList) {
        return (numberOfCars == 0 || numberOfCars > 5) ? carsList : carsList.subList(0, numberOfCars);
    }
}
