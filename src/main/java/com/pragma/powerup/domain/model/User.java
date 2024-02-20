package com.pragma.powerup.domain.model;
import java.time.LocalDate;

public class User {

    private Long id;
    private String name;
    private String lastname;
    private String idUser;
    private String number;
    private LocalDate birthDate;
    private String email;
    private String password;
    private String role;

    public User(Long id, String name, String lastname, String idUser, String number, LocalDate birthDate, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.idUser = idUser;
        this.number = number;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}


