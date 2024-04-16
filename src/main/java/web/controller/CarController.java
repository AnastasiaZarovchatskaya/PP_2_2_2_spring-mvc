package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;
    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam(value = "count",defaultValue = "5") int init) {
        List<String> cars = new ArrayList<>();
        cars.add(carService.getNumberOfCars(init).toString());
        model.addAttribute("cars", cars);
        return "cars";

    }
}
