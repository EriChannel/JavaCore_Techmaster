package model;

import utils.Util;

import java.time.LocalDate;

public class Account {
    private String id;
    private String userName;
    private String email;
    private String password;
    private LocalDate createAt;


    public Account(String userName, String email, String password, LocalDate createAt) {
        this.id = Util.generateId(5);
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
