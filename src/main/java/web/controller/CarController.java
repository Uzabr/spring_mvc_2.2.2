package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carService = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}