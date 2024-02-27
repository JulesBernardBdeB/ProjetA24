package com.example.a24_fitnessapp.Model;

import java.util.List;

public class Recipe {
    private Long id;
    private String recipeName;
    private List<String> recipeGoals;
    private List<String> recipeRestrictions;
    private List<String> recipeDiets;
    private String mealType;
    private String dishType;
    private String cuisineType;
    private int prepTime;
    private int servings;
    private int caloriesPerServing;
    private List<String> ingredients;
    private List<String> instructions;
    private List<String> dailyValues;
    private List<String> nutritionInfo;

    public Recipe(String recipeName, List<String> recipeGoals, List<String> recipeRestrictions, List<String> recipeDiets, String mealType, String dishType, String cuisineType, int prepTime, int servings, int caloriesPerServing, List<String> ingredients, List<String> instructions, List<String> dailyValues, List<String> nutritionInfo) {
        this.recipeName = recipeName;
        this.recipeGoals = recipeGoals;
        this.recipeRestrictions = recipeRestrictions;
        this.recipeDiets = recipeDiets;
        this.mealType = mealType;
        this.dishType = dishType;
        this.cuisineType = cuisineType;
        this.prepTime = prepTime;
        this.servings = servings;
        this.caloriesPerServing = caloriesPerServing;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.dailyValues = dailyValues;
        this.nutritionInfo = nutritionInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<String> getRecipeGoals() {
        return recipeGoals;
    }

    public void setRecipeGoals(List<String> recipeGoals) {
        this.recipeGoals = recipeGoals;
    }

    public List<String> getRecipeRestrictions() {
        return recipeRestrictions;
    }

    public void setRecipeRestrictions(List<String> recipeRestrictions) {
        this.recipeRestrictions = recipeRestrictions;
    }

    public List<String> getRecipeDiets() {
        return recipeDiets;
    }

    public void setRecipeDiets(List<String> recipeDiets) {
        this.recipeDiets = recipeDiets;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public void setCaloriesPerServing(int caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public List<String> getDailyValues() {
        return dailyValues;
    }

    public void setDailyValues(List<String> dailyValues) {
        this.dailyValues = dailyValues;
    }

    public List<String> getNutritionInfo() {
        return nutritionInfo;
    }

    public void setNutritionInfo(List<String> nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }
}
