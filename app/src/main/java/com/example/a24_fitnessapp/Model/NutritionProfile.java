package com.example.a24_fitnessapp.Model;

import java.util.List;

public class NutritionProfile {
    private Long id;
    private Long userId;
    private String gender;
    private int age;
    private double weight;
    private double height;
    private List<String> goals;
    private String activityLevel;
    private List<String>[] restrictions;
    private List<String> diets;
    private int dailyCalories;

    public NutritionProfile(Long userId, String gender, int age, double weight, double height, List<String> goals, String activityLevel, List<String>[] restrictions, List<String> diets, int dailyCalories) {
        this.userId = userId;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.goals = goals;
        this.activityLevel = activityLevel;
        this.restrictions = restrictions;
        this.diets = diets;
        this.dailyCalories = dailyCalories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<String> getGoals() {
        return goals;
    }

    public void setGoals(List<String> goals) {
        this.goals = goals;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public List<String>[] getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<String>[] restrictions) { this.restrictions = restrictions; }

    public List<String> getDiets() {
        return diets;
    }

    public void setDiets(List<String> diets) { this.diets = diets; }

    public int getDailyCalories() {
        return dailyCalories;
    }

    public void setDailyCalories(int dailyCalories) {
        this.dailyCalories = dailyCalories;
    }
}
