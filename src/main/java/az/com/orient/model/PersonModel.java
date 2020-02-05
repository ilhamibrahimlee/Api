package az.com.orient.model;

import az.com.orient.entity.EntityPerson;

import javax.swing.text.html.parser.Entity;

public class PersonModel {

    Integer id ;
    String name;
    String surname;
    String email;
    String userName;

    public PersonModel() {
    }

    public PersonModel(Integer id, String name, String surname, String email, String userName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.userName = userName;
    }
    public PersonModel(EntityPerson entityPerson){
        this.id=entityPerson.getId();
        this.name=entityPerson.getName();
        this.surname=entityPerson.getSurname();
        this.email=entityPerson.getEmail();
        this.userName=entityPerson.getUserName();


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
