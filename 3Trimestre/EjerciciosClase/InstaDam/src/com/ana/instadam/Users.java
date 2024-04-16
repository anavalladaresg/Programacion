package com.ana.instadam;
/**
 * Clase com.ana.instadam.Users que contiene los usuarios de la aplicación.
 */

import javax.swing.*;
import java.util.ArrayList;

public class Users {
    private ArrayList<User> userList = new ArrayList<>();
    private User currentUser = null;

    /**
     * Método que permite al usuario iniciar sesión.
     *
     * @param username Nombre de usuario.
     * @param password Contraseña.
     */
    public void signIn(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Username or password incorrect.");
    }

    /**
     * Método que permite al usuario registrarse.
     *
     * @param username Nombre de usuario.
     * @param password Contraseña.
     */
    public void signUp(String username, String password) {
        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username cannot be empty or null.");
            return;
        }
        if (isUsernameTaken(username)) {
            JOptionPane.showMessageDialog(null, "Username already exists.");
            return;
        }
        User newUser = new User(username, password);
        userList.add(newUser);
        currentUser = newUser;
    }

    /**
     * Método que cierra la sesión del usuario.
     */
    public void signOut() {
        currentUser = null;
    }

    /**
     * Método que verifica si el usuario está logueado.
     *
     * @return true si el usuario está logueado, false en caso contrario.
     */
    public boolean isUserLoggedIn() {
        return currentUser != null;
    }

    /**
     * Método que obtiene el usuario actual.
     *
     * @return Usuario actual.
     */
    public User getCurrentUser() {
        return currentUser;
    }

    /**
     * Método que verifica si el nombre de usuario está tomado.
     *
     * @param username Nombre de usuario.
     * @return true si el nombre de usuario está tomado, false en caso contrario.
     */
    public boolean isUsernameTaken(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}