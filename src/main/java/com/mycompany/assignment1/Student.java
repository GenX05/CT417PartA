/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;

import java.io.*;
import org.joda.time.DateTime;

/**
 *
 * @author 
 * Mark Walsh
 * 12100937
 * CT417
 */
public class Student
{
    //declare variables
    public String Name;
    public String Age;
    public DateTime DOB;
    public String Username;
    public int year;
    public int studentID = 1617000;//ststic student ID number
    //constrcutor
    public Student(String name, String age, DateTime dob)
    {
        this.Name = name;
        this.Age = age;
        year = Integer.parseInt(age);
        this.DOB = dob.minusYears(year);       
        this.setUserName();
    }
    //Setters
    public void setUserName()
    {
        this.Username = this.Name + this.Age;
    }
    public void setName(String name)
    {
        this.Name = name;  
    }
    public void setAge(String age)
    {
        this.Age = age;
    }
    public void setDob(DateTime dob)
    {
        this.DOB = dob.minusYears(year);
    }
    
    //Getters		
    public String getName()
    {
        return this.Name;
    }
    public String getAge()
    {
        return this.Age;
    }
    public DateTime getDob()
    {
        return this.DOB;
    }
    public String getUser()
    {
        return this.Username;
    }
    // Override toString method
    @Override
    public String toString()
    {
        String str = " Student Name: " +  this.Name + "\n Student ID: " + this.studentID + "\n Username: " + this.Username + " \n Age: " + this.Age + "\n Date of birth: " + this.DOB + "\n";
        return str;
    }
}
