package model.classes;

public class Users {
    int id_User;
    String name;
    String email;
    String password;

    public Users(int id_User, String name, String email, String password) {
        this.id_User = id_User;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId_User() {
        return id_User;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
