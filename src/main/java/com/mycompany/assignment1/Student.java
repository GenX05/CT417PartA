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
    public int id;
    static int studentID = 1617000;
    //constrcutor
    public Student(String name, String age, DateTime dob)
    {
        this.Name = name;
        this.Age = age;
        this.DOB = dob;       
        this.setUserName();
        this.id = this.studentID;
    }
    //Setters
    private void setUserName()
    {
        this.Username = this.Name + this.Age;
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
}
