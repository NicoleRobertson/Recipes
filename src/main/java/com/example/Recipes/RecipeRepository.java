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
        recipes.add(new Recipe(21L, "Ratatouille", Cuisine.FRENCH, 8, true, Difficulty.MEDIUM, "1. Cook and stir garlic and eggplant in olive oil until eggplant is soft. 2. Spread eggplant mixture evenly on the bottom of the dish. Sprinkle with Parmesan cheese. 3. Continue layering in this fashion, with onion, mushrooms, zucchini, and tomatoes, covering each layer with a sprinkling of salt and cheese.", "Garlic, Eggplant, Olive oil, Zucchini, Tomato, Parmesan, Onion, Mushroom"));
        recipes.add(new Recipe(22L, "French Onion Soup",Cuisine.FRENCH,  9, true, Difficulty.MEDIUM, "1. Cook onions in butter and olive oil until tender and translucent, not brown. 2. Add vegetarian broth and sherry. 3.Distribute the soup into small bowls, place one slice of bread in each bowl. 4. On top of the bread add three layers of cheese: Provolone, Swiss and Parmesan. Have it in the oven until the cheese is crispy brown.", "Butter, Olive oil, Onions, Vegetarian broth, Sherry, Bread, Provolone cheese, Swiss cheese, Parmesan Cheese"));
        recipes.add(new Recipe(9L, "Paneer Butter Masala", Cuisine.ASIAN, 6,  true, Difficulty.MEDIUM, "1. Fry the garlic and panner with butter. " +
                "2. Add the curry mix to the pan and spices as per taste. 3. Cook the curry well 4. Mix all together 5. Serve!", "Panner, Cream, Asian curry masala, Indian Spices, Garlic,butter"));
        recipes.add(new Recipe(10L, "Asian Dumplings", Cuisine.ASIAN, 5, true, Difficulty.MEDIUM, "1.Chop all the veggies & chilli. " +
                "2. Make a dough with flour, adding salt and roll them into small circles. 3. Add the veggies, salt, pepper to the circles and shape them to a dumpling 4. Steam them for 20 mins 5. Serve hot!", "Vegies, All purpose Flour,Green chilli, Salt, Pepper"));

    }
}
