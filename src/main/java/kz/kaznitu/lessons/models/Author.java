package kz.kaznitu.lessons.models;

import javax.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String firstName ;
    private String lastName ;
    private String mamandyk ;
    private String email ;

    public Author(){}

    public Author(String firstName, String lastName, String mamandyk, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastName = mamandyk;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMamandyk() {  return mamandyk;   }

    public void setMamandyk(String mamandyk) {  this.mamandyk = mamandyk;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
