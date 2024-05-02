package com.example.mentor.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MentorRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mentorid;

    private String name;

    private long mobileno;

    private int age;

    private char gender;

    private String jobrole;

    @Column(columnDefinition = "varchar(20) default('rejected!')")
    private String status;

    public MentorRequest( String name, long mobileno, int age, char gender, String jobrole,
            String status) {
        this.name = name;
        this.mobileno = mobileno;
        this.age = age;
        this.gender = gender;
        this.jobrole = jobrole;
        this.status = status;
    }

    @Override
    public String toString() {
        return "MentorRequest [name=" + name + ", mobileno=" + mobileno + ", age=" + age
                + ", gender=" + gender + ", jobrole=" + jobrole + ", status=" + status + "]";
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
