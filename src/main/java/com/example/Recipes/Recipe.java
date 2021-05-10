package com.example.Recipes;

public class Recipe {
    private long id;
    private String name;
    private Cuisine cuisine;
    private int numOfIngredients;
    private boolean isVegetarian;
    private Difficulty difficulty;
    private String description;
    private String ingredients;

    public Recipe (Long id, String name, Cuisine cuisine, Integer numOfIngredients,
                   boolean isVegetarian, Difficulty difficulty,String description, String ingredients) {
        this.id = id;
        this.name = name;
        this.cuisine = cuisine;
        this.numOfIngredients = numOfIngredients;
        this.isVegetarian = isVegetarian;
        this.difficulty = difficulty;
        this.description = description;
        this.ingredients = ingredients;
    }
}
