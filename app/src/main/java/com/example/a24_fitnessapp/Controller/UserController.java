package com.example.a24_fitnessapp.Controller;

import com.example.a24_fitnessapp.Model.*;

public class UserController {
    private DatabaseHelper dbHelper;

    public UserController(DatabaseHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    public void createUser(String firstName, String lastName, String username, String password) {
        // Vérifier que le nom d'utilisateur et le mot de passe respectent les critères requis
        if (!isValidUsername(username)) {
            // Afficher un message d'erreur ou lancer une exception indiquant que le nom d'utilisateur est invalide
            throw new IllegalArgumentException("Le nom d'utilisateur doit avoir :\n"
                                                + "- au moins une lettre majuscule,\n"
                                                + "- au moins une lettre minuscule,\n"
                                                + "- au moins un chiffre,\n"
                                                + "- entre 12 et 20 caractères.");
        }

        if (!isValidPassword(password)) {
            // Afficher un message d'erreur ou lancer une exception indiquant que le mot de passe est invalide
            throw new IllegalArgumentException("Le mot de passe doit avoir :\n"
                                                + "- au moins une lettre majuscule,\n"
                                                + "- au moins une lettre minuscule,\n"
                                                + "- au moins un chiffre,\n"
                                                + "- entre 12 et 20 caractères.");
        }

        // Vérifier que le nom d'utilisateur n'existe pas déjà dans la base de données
        if (dbHelper.isUserExists(username)) {
            // Afficher un message d'erreur ou lancer une exception indiquant que le nom d'utilisateur existe déjà
            return;
        }

        // Créer un objet User avec les informations fournies
        User user = new User(firstName, lastName, username, password);

        // Ajouter l'utilisateur à la base de données
        dbHelper.addUser(user);
    }

    private boolean isValidUsername(String username) {
        // Vérifier que le nom d'utilisateur a une longueur comprise entre 12 et 20 caractères
        if (username.length() < 12 || username.length() > 20) {
            return false;
        }

        // Vérifier qu'il y a au moins une lettre majuscule, une lettre minuscule et un chiffre dans le nom d'utilisateur
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        for (char c : username.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit;
    }

    private boolean isValidPassword(String password) {
        // Vérifier que le mot de passe a une longueur comprise entre 12 et 20 caractères
        if (password.length() < 12 || password.length() > 20) {
            return false;
        }

        // Vérifier qu'il y a au moins une lettre majuscule, une lettre minuscule et un chiffre dans le mot de passe
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit;
    }
}

