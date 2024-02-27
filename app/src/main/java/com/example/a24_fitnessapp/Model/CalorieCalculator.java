package com.example.a24_fitnessapp.Model;

import java.util.Objects;

public class CalorieCalculator {

    public double CalculateBMR(User user){
        double BMR = 0;
        if (Objects.equals(user.getGender(), "Men")){
            BMR = 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() + 5;
        } else if (Objects.equals(user.getGender(), "Women")){
            BMR = 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() - 161;
        }
        return BMR;
    }
}