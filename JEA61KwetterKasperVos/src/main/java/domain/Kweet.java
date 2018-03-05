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
public class Kweet {
    
    private Long id;
    private String message;
    private List<User> likeList;
    private User user;

    public Kweet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<User> getLikeList() {
        return likeList;
    }

    public void setLikeList(List<User> likeList) {
        this.likeList = likeList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    private void LikeTweet(User user) {
        likeList.add(user);
    }
    
    private void UnlikeTweet(User user) {
        likeList.remove(user);
    }
}
