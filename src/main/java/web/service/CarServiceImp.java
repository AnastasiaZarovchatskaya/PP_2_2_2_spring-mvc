package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> listCars;

    public CarServiceImp() {
        listCars = new ArrayList<>();
        listCars.add(new Car("Nissan", 3084, "while"));
        listCars.add(new Car("Kalina", 3905,"red"));
        listCars.add(new Car("Patriot", 5068, "black"));
        listCars.add(new Car("BMW",6075,"blue"));
        listCars.add(new Car("Honda",6048,"brown"));
    }

@Override
    public List<Car> getNumberOfCars(int count){
        if(count >= listCars.size()){
            return listCars;
        }else {
            return listCars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
