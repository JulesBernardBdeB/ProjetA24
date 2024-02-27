package com.example.a24_fitnessapp.Controller;

import com.example.a24_fitnessapp.Model.*;

public class UserController {
    public UserController() {
    }

    public void createUser(String firstName, String lastName, String email, String password) {
        // Vérifier que l'email et le mot de passe respectent les critères requis
        if (!isValidEmail(email)) {
            // Afficher un message d'erreur ou lancer une exception indiquant que l'email est invalide
            throw new IllegalArgumentException("L'email doit avoir un format valide.");
        }

        if (!isValidPassword(password)) {
            // Afficher un message d'erreur indiquant que le mot de passe n'a pas le bpn format
            throw new IllegalArgumentException("Le mot de passe doit avoir :\n"
                    + "- au moins une lettre majuscule,\n"
                    + "- au moins une lettre minuscule,\n"
                    + "- au moins un chiffre,\n"
                    + "- entre 12 et 20 caractères.");
        }

        // Créer un objet User avec les informations fournies
        User user = new User(firstName, lastName, email, password);
    }

    private boolean isValidEmail(String email) {
        // Vérifier la présence du caractère "@" dans l'email
        if (!email.contains("@")) {
            return false;
        }
        return true;
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


