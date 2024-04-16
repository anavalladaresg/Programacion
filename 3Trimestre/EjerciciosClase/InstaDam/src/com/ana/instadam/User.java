package com.ana.instadam;

/**
 * Clase com.ana.instadam.User que contiene los datos de los usuarios de la aplicación.
 */
public class User {
    private String username;
    private String password;

    /**
     * Constructor de la clase com.ana.instadam.User.
     *
     * @param username Nombre de usuario.
     * @param password Contraseña.
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}