package spring.h2.database;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class User {
    @Id
    @GeneratedValue
    Integer id;
    String firstName;
    String lastName;

    public User() {}

    public User(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

    public Integer getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return String.format("User[id=%d, firstName='%s', lastName='%s']",
            this.id,
            this.firstName,
            this.lastName
        );
    }
}