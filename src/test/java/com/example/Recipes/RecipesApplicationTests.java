package com.example.Recipes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
class RecipesApplicationTests {

	@Autowired
	RecipeRepository repository;

	@Test
	public void getRecipeTest() {
		Recipe recipe = repository.getRecipe(9L);
		Assert.hasText("Blabla", recipe.getName());
	}

}
