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
        recipes.add(new Recipe(21L, "Ratatouille", Cuisine.FRENCH, 8, true, Difficulty.MEDIUM, "1. Cook and stir garlic and eggplant in olive oil until eggplant is soft. 2. Spread eggplant mixture evenly on the bottom of the dish. Sprinkle with Parmesan cheese. 3. Continue layering in this fashion, with onion, mushrooms, zucchini, and tomatoes, covering each layer with a sprinkling of salt and cheese.", "Garlic, Eggplant, Olive oil, Zucchini, Tomato, Parmesan, Onion, Mushroom"));
        recipes.add(new Recipe(22L, "French Onion Soup",Cuisine.FRENCH,  9, true, Difficulty.MEDIUM, "1. Cook onions in butter and olive oil until tender and translucent, not brown. 2. Add vegetarian broth and sherry. 3.Distribute the soup into small bowls, place one slice of bread in each bowl. 4. On top of the bread add three layers of cheese: Provolone, Swiss and Parmesan. Have it in the oven until the cheese is crispy brown.", "Butter, Olive oil, Onions, Vegetarian broth, Sherry, Bread, Provolone cheese, Swiss cheese, Parmesan Cheese"));
    }
}
