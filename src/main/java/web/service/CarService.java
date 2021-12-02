package web.service;

import web.dao.CarServiceDao;
import web.model.Car;

import java.util.List;

public interface CarService extends CarServiceDao {
    List<Car> getCarsByCount(List<Car> carList, Integer count);
}
