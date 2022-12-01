package com.example.mindi.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "username")
    @NotEmpty(message = "Username should not be empty")
    @Size(max = 100, min = 3, message = "Username should be no shorter that 3 characters and no longer thar 100 characters")
    String username;

    @Column(name = "year_of_birth")
    @Min(value = 1900, message = "Year should be more than 1900")
    int year;

    @Column(name = "password")
    String password;

    public Person(String username, int year) {
        this.username = username;
        this.year = year;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", year=" + year +
                ", password='" + password + '\'' +
                '}';
    }
}
