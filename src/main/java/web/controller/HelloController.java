package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    private final CarService carService;

    public HelloController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/cars")
    public String carController(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        int limit = (count == null || count <= 0 || count >= 5) ? 5 : count;
        model.addAttribute("cars", carService.getCars(limit));
        return "cars";
    }

//    @GetMapping(value="/cars")
//    public String getAllCars(ModelMap model) {
//        model.addAttribute("cars", carService.getCars());
//        return "cars";
//    }


}