package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.model.CarList;

import java.util.List;

@Controller
public class CarController {
    @RequestMapping(value = "/car")
    @PostMapping
    public String printGoodBye(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars = CarList.getCar(count);
        model.addAttribute("cars", cars);
        return "car";
    }
}