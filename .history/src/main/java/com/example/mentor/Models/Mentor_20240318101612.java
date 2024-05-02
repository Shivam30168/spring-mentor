package com.example.mentor.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MentorDetails")
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private long mobileno;
    private int age;
    private char gender;
    private String jobrole;
    

    public Mentor(int id, String name, long mobileno, int age, char gender, String jobrole) {
        this.id = id;
        this.name = name;
        this.mobileno = mobileno;
        this.age = age;
        this.gender = gender;
        this.jobrole = jobrole;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getMobileno() {
        return mobileno;
    }
    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getJobrole() {
        return jobrole;
    }
    public void setJobrole(String jobrole) {
        this.jobrole = jobrole;
    }
    
    @Override
    public String toString() {
        return "Mentor [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", age=" + age + ", gender=" + gender
                + ", jobrole=" + jobrole + "]";
    }
    

}
