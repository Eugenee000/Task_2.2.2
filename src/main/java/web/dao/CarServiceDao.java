package web.dao;

import web.model.Car;

import java.util.List;

public interface CarServiceDao {
    List<Car> getCarsByCount(List<Car> carList, Integer count);
}
