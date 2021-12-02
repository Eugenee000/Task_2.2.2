package web.dao;

import web.model.Car;

import java.util.List;

public class CarServiceDaoImpl implements CarServiceDao {
    @Override
    public List<Car> getCarsByCount(List<Car> carList, Integer count) {
        if (count == null || count > 5) {
            return carList.subList(0, 5);
        } else if (count > 0 || count == 0) {
            return carList.subList(0, count);
        }
        return carList;
    }
}
