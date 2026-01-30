package com.barpersonal.tragos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.barpersonal.tragos.service.CocktailService;

@Controller
public class CocktailControler {
    @Autowired
    private CocktailService cocktailService;

    @GetMapping("/")
    public String index(Model model) {
        // Obtenemos la lista de cocktails del service
        model.addAttribute("drinks", cocktailService.getPopularCocktails());
        
        // Retornamos el nombre del archivo HTML (sin el .html)
        return "index";
    }
}
