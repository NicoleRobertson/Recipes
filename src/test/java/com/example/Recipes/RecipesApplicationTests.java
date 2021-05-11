package com.example.Recipes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class RecipesApplicationTests {

	@Autowired
	RecipeRepository repository;

	@Test
	public void getRecipeTest() {
		Recipe recipe = repository.getRecipe(1L);
		Assertions.assertEquals("Pasta Carbonara", recipe.getName());
		Assertions.assertTrue(recipe.isVegetarian());//vegeterian test
		Assertions.assertFalse(recipe.isVegetarian());//non-vegeterian test
		Assertions.assertEquals(Cuisine.ITALIAN, recipe.getCuisine());

	}

}
