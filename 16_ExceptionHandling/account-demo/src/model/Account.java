package model;

import utils.Util;

import java.time.LocalDate;

public class Account {
    private String  id;
    private String username;
    private String email;
    private String password;
    private LocalDate createAt;

    public Account(String username, String email, String password, LocalDate createAt) {
        this.id = Util.generateId(5);
        this.username = username;
        this.email = email;
        this.password = password;
        this.createAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }
}
