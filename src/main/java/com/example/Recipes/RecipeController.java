package com.example.Recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    RecipeRepository repository;

    @GetMapping("/")
    public String recipes(Model model) {
        return repository
    }
}
