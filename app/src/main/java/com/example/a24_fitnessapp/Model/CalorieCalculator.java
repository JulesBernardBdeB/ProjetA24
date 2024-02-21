package com.example.a24_fitnessapp.Model;

public class CalorieCalculator {

    public double CalculateBMR(User user){
        if (user.getGender() == "Men"){
            return 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() + 5
        } else if (user.getGender() == "Women"){
            return 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() - 161
        }
    }
}