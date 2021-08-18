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
    public String getListCars(Model model, HttpServletRequest httpServletRequest) {
        model.addAttribute("cars", carService.getListCars());
        if (httpServletRequest.getParameter("count") != null) {
            int count = Integer.parseInt(httpServletRequest.getParameter("count"));
            model.addAttribute("list", carService.show(count));
            return "list";
        }
        return "cars";
    }

}
