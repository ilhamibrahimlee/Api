package az.com.orient.entity;

import az.com.orient.model.PersonModel;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class EntityPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="name")
    String name;

    String surname;

    String email;

    String userName;

    public EntityPerson() {
    }

    public EntityPerson(String name, String surname, String email, String userName) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.userName = userName;
    }

    public EntityPerson(PersonModel personModel) {
        this.name = personModel.getName();
        this.surname = personModel.getSurname();
        this.email = personModel.getEmail();
        this.userName = personModel.getUserName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
