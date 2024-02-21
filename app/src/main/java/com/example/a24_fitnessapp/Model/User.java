package com.example.a24_fitnessapp.Model;

import java.sql.Array;

public class User {

    private String name;
    private String lastName;
    private String gender;
    private  int age;
    private double weight;
    private double height;
    private double IMC;
    private double recWaterIntake;
    private String goal[];
    private String dietRestrictions[];
    private String dietPreference[];
    private int dailyCalorie;

    public User(String name, String lastName, String gender, int age, double weight, double height,
                double IMC, double recWaterIntake, String[] goal, String[] dietRestrictions, String
                        dietPreference, int dailyCalorie) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.IMC = IMC;
        this.recWaterIntake = recWaterIntake;
        this.goal = goal;
        this.dietRestrictions = dietRestrictions;
        this.dietPreference = dietPreference;
        this.dailyCalorie = dailyCalorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String[] getGoal() {
        return goal;
    }

    public void setGoal(String[] goal) {
        this.goal = goal;
    }

    public String[] getDietRestrictions() {
        return dietRestrictions;
    }

    public void setDietRestrictions(String[] dietRestrictions) {
        this.dietRestrictions = dietRestrictions;
    }

    public String getDietPreference() {
        return dietPreference;
    }

    public void setDietPreference(String dietPreference) {
        this.dietPreference = dietPreference;
    }

    public int getDailyCalorie() {
        return dailyCalorie;
    }

    public void setDailyCalorie(int dailyCalorie) {
        this.dailyCalorie = dailyCalorie;
    }
    public double getIMC() {
        return weight/(height*height);
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public double getRecWaterIntake() {
        return weight*40;
    }

    public void setRecWaterIntake(double recWaterIntake) {
        this.recWaterIntake = recWaterIntake;
    }


}
