package web.service;

import web.dao.CarServiceDao;
import web.dao.CarServiceDaoImpl;
import web.model.Car;

import java.util.List;

public class CarSeviceImpl implements CarService {
    private final CarServiceDao CAR_SERVICE_DAO = new CarServiceDaoImpl();

    @Override
    public List<Car> getCarsByCount(List<Car> carList, Integer count) {
        return CAR_SERVICE_DAO.getCarsByCount(carList, count);
    }
}
