package spring.framework.joker.example.jokerexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.framework.joker.example.jokerexample.services.GetQuoteService;

@Controller
public class WebController {

    GetQuoteService service;

    public WebController(GetQuoteService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {

        model.addAttribute("joke", service.getQuote());

        return "chuckNorris";
    }
}
