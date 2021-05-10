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
        recipes.add(new Recipe(2L, "Spagetti Pomodoro", Cuisine.ITALIAN, 6, true, Difficulty.EASY, "1. Chop onoin and fry it in a caserol with some butter. 2 Add sugar and tomatoes " +
                "3. Add half of the basil and let it cook for 5-10 min. 4. Cook the pasta. 5. Mix the pasta and the sauce 6. Serve with mozzarella and rest of the basil", "Garlic, Butter, Sugar, Basil, Pasta, Mozarella"));
        recipes.add(new Recipe(3L, "Risotto", Cuisine.ITALIAN, 7, true, Difficulty.MEDIUM, "1. Cook the broth and keep it warm. 2. Chop onion and garlic. Fry  with butter for 10 min. Add the rise and fry additionally 10 min." +
                "3. Turn upp the heat and add wine and some of the broth. Stirr often! Once the fluid is gone - add more broth. 4. Keep adding broth until it is finished and the rice is creamy. 5. Add the rest of the butter and the cheese. Serve immedietly!", "Arboriorice, Vegetable broth, Yellow Onion, Garlic, Butter, White Wine, Parmesan"));
        recipes.add(new Recipe(3L, "Salsa Chicken", Cuisine.MEXICAN, 5, false, Difficulty.EASY, "1. Preheat oven to 375 degrees F. 2. Sprinkle taco seasoning on both sides of chicken breasts, and pour salsa over all" +
                "Bake in the oven for 25-35 minutes or until chicken is tender. 4. Sprinkle chicken evenly with cheese and continue baking for 3-5 minutes. 5. Top with sour cream and serve with rice.", "Chicken breasts, Taco Seasoning Mix, Salsa, Cheddar Cheese, Sour Cream"));
        recipes.add(new Recipe(4L, "Chorizo Street Tacos", Cuisine.MEXICAN, 5, false, Difficulty.MEDIUM, "1. Remove chorizo case and cruble the meet 2. Mix chorizo and chipotle peppers in adobo sauce together in a bowl" +
                "3. Het a skillet over medium high heat, add chorizo mixture and cook until cripp (5-7 min). Transfer chorizo to a plate, reserving grease in the skillet. 4. Heat tortillas in the grease until warm. Fill with chorizo, onion and cilantro", "Chorizo Sausage, Chipotle Peppers in Adobo Sauce, Corn Tortillas, Onoin, Cilantro"));

    }
}
