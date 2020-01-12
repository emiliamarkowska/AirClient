package DatabaseModel;

import java.text.SimpleDateFormat;

public class User implements IEntity {

    private int id;
    private String login;
    private String name;
    private String surname;
    private String email;
    private SimpleDateFormat creationTime;
    private SimpleDateFormat dayOfBirth;
    private boolean isAdmin;
    private boolean isActive;
    private String hashedPassword;

    public User(int id, String login, String name, String surname, String email, SimpleDateFormat creationTime,
                SimpleDateFormat dayOfBirth, boolean isAdmin, boolean isActive, String hashedPassword) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.creationTime = creationTime;
        this.dayOfBirth = dayOfBirth;
        this.isAdmin = isAdmin;
        this.isActive = isActive;
        this.hashedPassword = hashedPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SimpleDateFormat getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(SimpleDateFormat creationTime) {
        this.creationTime = creationTime;
    }

    public SimpleDateFormat getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(SimpleDateFormat dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
