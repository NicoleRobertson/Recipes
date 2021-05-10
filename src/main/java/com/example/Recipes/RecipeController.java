package com.example.Recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    RecipeRepository repository;

    @GetMapping("/Home")
    public String recipes(Model model) {
        List<Recipe> recipes = repository.getRecipes();
        model.addAttribute("recipes", recipes);
        return "Recipes";
    }

    @GetMapping("/Home/recipe/{id}")
    public String recipe(Model model, @PathVariable Long id) {
        Recipe recipe = repository.getRecipe(id);
        model.addAttribute("recipe", recipe);

        return "Recipe";
    }
}
