/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spdvi;
import java.time.LocalDate;

/**
 *
 * @author Alumne
 */
public class User {

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private String gender; 
    private boolean isAlive;

    @Override
    public String toString() {
        return id + ":" + lastName + "," + firstName + "-   " + birthdate + "-" + gender + "-" + isAlive;
    }

    public User(int id, String firstName, String lastName, LocalDate birthdate, String gender, boolean isAlive) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.gender = gender;
        this.isAlive = isAlive;
    }
}
