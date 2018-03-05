/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Kasper
 */
public class User {
    
    private Long id;
    private String name;
    private String username;
    private String password;
    private String biography;
    
    private List<User> followingList;
    
    private List<Kweet> kweets;
    private Kweet k;

    public User() {
    }

    public User(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<User> getFollowingList() {
        return followingList;
    }

    public void setFollowingList(List<User> followingList) {
        this.followingList = followingList;
    }
    
    public void addKweet(Kweet k)
    {
        kweets.add(k);
    }
    
    public void removeKweet(Kweet k)
    {
        kweets.remove(k);
    }
}
