package com.example.Jokes.App.Controller;

import com.example.Jokes.App.Service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokesService jokesService;

    JokesController(JokesService jokesService){
        this.jokesService =jokesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokesService.getJoke());
        return "index";
    }
}
