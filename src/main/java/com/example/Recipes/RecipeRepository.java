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
        recipes.add(new Recipe(2L, "Hamburger", Cuisine.AMERICAN, 4, false, Difficulty.EASY, "1. Mix the meat with spices and form 4 burgers." +
                "2. Fry in oil or butter 2-3 minutes on each side. 3. Roast the bread and accesories of your choice.", "Meat, bread"));
        recipes.add(new Recipe(3L, "Manhattansalad", Cuisine.AMERICAN, 3,true, Difficulty.EASY, "1. Rince the sladleafs and put on a plate. Add orange, pepper sellery and nuts" +
                "2. Put the fruit and vegetables on the salad 3. Add the dressing.", "Salad, oranges,pepper, selleri, dressing"));
    }
}
