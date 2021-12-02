package web.model;

import web.service.CarService;
import web.service.CarSeviceImpl;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private static final CarService CAR_SEVICE = new CarSeviceImpl();
    private static final ArrayList<Car> CAR_LIST = new ArrayList<>();

    public static List<Car> getCar(Integer count) {
        CAR_LIST.add(new Car("1.Honda (Civic)", "gray", 1.5));
        CAR_LIST.add(new Car("2.Toyota (Supra)", "red", 2.5));
        CAR_LIST.add(new Car("3.Lada (Granta)", "cherry", 1.6));
        CAR_LIST.add(new Car("4.BMW (M3)", " emerald", 3.0));
        CAR_LIST.add(new Car("5.Volkswagen (Caddy)", "blue", 1.6));
        return CAR_SEVICE.getCarsByCount(CAR_LIST, count);
    }
}
