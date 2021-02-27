package udemy.course.exercise6;

import java.util.Collections;

public class Hostel {
    private String name;
    private String email;

    public Hostel(String name, String email) {
        this.name = name;
        this.email = email;
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

    public String toString() {
        return name
                + ", "
                + email;
    }
}
