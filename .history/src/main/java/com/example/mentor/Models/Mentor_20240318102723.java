package com.example.mentor.Models;

import jakarta.persistence.Column;
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
    @Column(name = "Mentor_Id")
    private int id;

    @Column(name = "Mentor_Name")
    private String name;

    @Column(name = "Mentor_MobileNo")
    private long mobileno;

    @Column(name = "Mentor_Age")
    private int age;

    @Column(name = "Mentor_Gender")
    private char gender;

    @Column(name = "Mentor_JobRole")
    private String jobrole;
    

    
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
