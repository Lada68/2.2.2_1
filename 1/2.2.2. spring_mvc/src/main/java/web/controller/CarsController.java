package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.CarDao;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getListCars(@RequestParam("count") int count, Model model) {
        model.addAttribute("cars", carService.getListCars());
        if (count > 0) {
            model.addAttribute("list", carService.show(count));
            return "list";
        }
        return "cars";
    }

}
