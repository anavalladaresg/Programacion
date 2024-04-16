package com.ana.instadam;
/**
 * Clase com.ana.instadam.Posts que contiene los posts de los usuarios.
 */

import javax.swing.*;
import java.util.ArrayList;

public class Posts {
    private ArrayList<String> postList = new ArrayList<>();

    /**
     * Método que obtiene la lista de posts.
     *
     * @return Lista de posts.
     */
    public ArrayList<String> getPostList() {
        return postList;
    }

    public void setPostList(ArrayList<String> postList) {
        this.postList = postList;
    }

    /**
     * Método que añade un post a la lista de posts.
     *
     * @param description Descripción del post.
     * @param user        Usuario que publica el post.
     */
    public void addPost(String description, User user) {
        String post = "@" + user.getUsername() + ": " + description;
        postList.add(post);
    }

    /**
     * Método que muestra los posts.
     */
    public void showPosts() {
        StringBuilder posts = new StringBuilder();
        for (String post : postList) {
            posts.append(post).append("\n");
        }
        JOptionPane.showMessageDialog(null, posts.toString());
    }

    /**
     * Método que verifica si la lista de posts está vacía.
     *
     * @return true si la lista de posts está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return postList.isEmpty();
    }
}