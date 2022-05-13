package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value = "numberOfCars", defaultValue = "5", required = false) int numberOfCars, ModelMap model) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car(1, "VAZ", 2110));
        carsList.add(new Car(2, "VAZ", 2101));
        carsList.add(new Car(3, "VAZ", 2109));
        carsList.add(new Car(4, "VAZ", 2108));
        carsList.add(new Car(5, "VAZ", 2111));
        carsList = carService.getCars(numberOfCars, carsList);
        model.addAttribute("cars", carsList);
        return "cars";




}
}
