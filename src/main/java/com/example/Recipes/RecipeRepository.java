package com.example.Recipes;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {
    private List<Recipe> recipes;


    public RecipeRepository() {
        recipes = new ArrayList<>();
        recipes.add(new Recipe(1L, "Pasta Carbonara", Cuisine.ITALIAN, 5, false, Difficulty.EASY, "1. Fry the garlic with the bacon. " +
                "2. Whip the egg and cream and pour it over the bacon. 3. Cook the pasta 4. Mix all together 5. Serve!", "Bacon, Cream, Egg, Pasta, Garlic"));
        recipes.add(new Recipe(9L, "Paneer Butter Masala", Cuisine.ASIAN, 6,  true, Difficulty.MEDIUM, "1. Fry the garlic and panner with butter. " +
                "2. Add the curry mix to the pan and spices as per taste. 3. Cook the curry well 4. Mix all together 5. Serve!", "Panner, Cream, Asian curry masala, Indian Spices, Garlic,butter"));
        recipes.add(new Recipe(10L, "Asian Dumplings", Cuisine.ASIAN, 5, true, Difficulty.MEDIUM, "1.Chop all the veggies & chilli. " +
                "2. Make a dough with flour, adding salt and roll them into small circles. 3. Add the veggies, salt, pepper to the circles and shape them to a dumpling 4. Steam them for 20 mins 5. Serve hot!", "Vegies, All purpose Flour,Green chilli, Salt, Pepper"));

    }


}
