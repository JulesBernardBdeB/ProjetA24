package com.example.a24_fitnessapp.Model;

import java.util.HashMap;
import java.util.Objects;

public class CalorieCalculator {

    public double getBMR(NutritionProfile user){
        double BMR = 0;
        if (Objects.equals(user.getGender(), "Men")){
            BMR = 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() + 5;
        } else if (Objects.equals(user.getGender(), "Women")){
            BMR = 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() - 161;
        }
        return BMR;
    }

    //This will need to be refactored, as MET values should be stored in the database instead
    public HashMap<String, Integer> getMETvalues(){
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
        MET.put("Calisthenics: vigorous", 26);
        MET.put("Weight Lifting: moderate", 10);
        MET.put("Weight Lifting: vigorous", 20);
        return MET;
    }

    //This will need to be refactored, as MET values should be stored in the database instead
    public double getCaloriesBurned(int time, String exercise, NutritionProfile user ){
        double Weight = user.getWeight();
        int MET = getMETvalues().get(exercise);
        return (time*MET*Weight)/200;
    }



}