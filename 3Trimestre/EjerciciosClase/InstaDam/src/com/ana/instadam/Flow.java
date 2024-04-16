package com.ana.instadam;
/**
 * Clase com.ana.instadam.Flow que contiene el flujo de la aplicación.
 */

import javax.swing.*;

public class Flow {
    private Users users = new Users();
    private Posts posts = new Posts();
    private int option;

    /**
     * Método que inicia el flujo principal de la aplicación.
     */
    public void start() {
        do {
            option = getOptionFromUser("1. Sign in\n2. Sign up\n3. Look at posts\n4. Exit");
            switch (option) {
                case 1:
                    signIn();
                    break;
                case 2:
                    signUp();
                    break;
                case 3:
                    showPosts();
                    break;
            }
            if (users.isUserLoggedIn()) {
                do {
                    userOptions();
                } while (users.isUserLoggedIn());
            }
        } while (option != 4);
    }

    /**
     * Método que permite al usuario iniciar sesión.
     */
    private void signIn() {
        String username = JOptionPane.showInputDialog(null, "Username: ");
        String password = JOptionPane.showInputDialog(null, "Password: ");
        users.signIn(username, password);
    }

    /**
     * Método que permite al usuario registrarse.
     */
    private void signUp() {
        String username = JOptionPane.showInputDialog(null, "Username: ");
        String password = getPasswordFromUser();
        users.signUp(username, password);
    }

    /**
     * Método que muestra los posts.
     */
    private void showPosts() {
        if (!posts.isEmpty()) {
            posts.showPosts();
        } else {
            JOptionPane.showMessageDialog(null, "There are no posts to show.");
        }
    }

    /**
     * Método que muestra las opciones del usuario.
     */
    private void userOptions() {
        option = getOptionFromUser("<html><b>@" + users.getCurrentUser().getUsername() + "</b></html>\n1. Publish a post\n2. Look at posts\n0. Sign out");
        switch (option) {
            case 1:
                publishPost();
                break;
            case 2:
                showPosts();
                break;
            case 0:
                users.signOut();
                break;
        }
    }

    /**
     * Método que permite al usuario publicar un post.
     */
    private void publishPost() {
        String postDescription = JOptionPane.showInputDialog("Enter post: ");
        posts.addPost(postDescription, users.getCurrentUser());
    }

    /**
     * Método que obtiene la opción del usuario.
     *
     * @param message Mensaje a mostrar al usuario.
     * @return Opción ingresada por el usuario.
     */
    private int getOptionFromUser(String message) {
        int option = 0;
        try {
            option = Integer.parseInt(JOptionPane.showInputDialog(message));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid option.");
        }
        return option;
    }

    /**
     * Método que muestra la contraseña del usuario como puntos.
     * @return Contraseña del usuario.
     */
    private String getPasswordFromUser() {
        JPasswordField passwordField = new JPasswordField();
        Object[] message = {"Password:", passwordField};
        int option = JOptionPane.showConfirmDialog(null, message, "Enter password", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            return new String(passwordField.getPassword());
        } else {
            return null;
        }
    }
}