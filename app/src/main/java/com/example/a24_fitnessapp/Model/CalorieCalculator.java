package com.example.a24_fitnessapp.Model;

import java.util.HashMap;
import java.util.Objects;

public class CalorieCalculator {

    public double CalculateBMR(NutritionProfile user){
        double BMR = 0;
        if (Objects.equals(user.getGender(), "Men")){
            BMR = 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() + 5;
        } else if (Objects.equals(user.getGender(), "Women")){
            BMR = 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() - 161;
        }
        return BMR;
    }

    public HashMap<String, Integer> METvalues(){
        HashMap<String, Integer> MET = new HashMap<>();
        MET.put("Swimming: moderate", 20);
        MET.put("Swimming: vigorous", 33);
        MET.put("Running: slow", 26);
        MET.put("Running: moderate", 34);
        MET.put("Running: fast", 41);
        MET.put("Running: very fast", 53);
        MET.put("Cycling: slow", 26);
        MET.put("Cycling: moderate", 33);
        MET.put("Cycling: fast", 40);
        MET.put("Cycling: very fast", 55);
        MET.put("Aerobics, Step: high impact", 33);
        MET.put("Aerobics, Step: low impact", 23);
        MET.put("Aerobics: high impact", 23);
        MET.put("Aerobics: low impact", 18);
        MET.put("Aerobics: water", 13);
        MET.put("Calisthenics: moderate", 15);
    }
}