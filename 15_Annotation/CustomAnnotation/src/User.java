import java.time.LocalDate;

public class User {
    @JsonElement(name = "id", type = Integer.class, isPrimaryKey = true)
    private int id;

    @JsonElement(name = "user_name", type = String.class)
    private String userName;

    @JsonElement(name = "email", type = String.class)
    private String email;

    @JsonElement(name = "password", type = String.class)
    private String password;

    @JsonElement(name = "create_at", type = LocalDate.class)
    private LocalDate createAt;

    public User(int id, String userName, String email, String password, LocalDate createAt) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.createAt = createAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
