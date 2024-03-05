package ibf.ssf.day11workshop.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = { "/", "/index" })
public class RandomController {
    @GetMapping
    public String getRandomNumber(Model model) {
        System.out.println(">>> GET /index");
        Random random = new Random();
        Integer number = random.nextInt(31);
        System.out.println("Random number: " + number);

        model.addAttribute("number", number); // name, actual value
        return "index";
    }
}
