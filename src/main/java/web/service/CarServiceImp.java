package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private List<Car> listCars;

    public CarServiceImp() {
        listCars = getAllCars();
    }

    public List<Car> getAllCars(){
        listCars = new ArrayList<>();
        listCars.add(new Car("Nissan", 3084, "while"));
        listCars.add(new Car("Kalina", 3905,"red"));
        listCars.add(new Car("Patriot", 5068, "black"));
        listCars.add(new Car("BMW",6075,"blue"));
        listCars.add(new Car("Honda",6048,"brown"));
        return listCars;
    }

@Override
    public List<Car> getNumberOfCars(int init){
        return listCars.stream().limit(init).collect(Collectors.toList());
    }
}
