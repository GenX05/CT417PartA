/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;
import java.io.*;
import java.util.*;
import org.joda.time.DateTime;

/**
 *
 * @author
 * Mark Walsh
 * 12100937
 * CT417
 */
public class Course
{
    //declare variables
    public String courseName;
    public ArrayList<Module> mod = new ArrayList<Module>();
    public DateTime Start;
    public DateTime End;

    //constructor
    public Course(String name, DateTime start, DateTime end)
    {
        this.courseName = name;
        this.Start = start;
        this.End = end;
    }
    //setters
    public void setModules(ArrayList<Module> modules)
    {
        this.mod = modules;
    }   
    //add Module
    public void addMod(Module m)
    {
        mod.add(m);
    }   
    //getters
    private String getCourse()
    {
        return courseName;
    }
    private DateTime getend()
    {
        return End;
    }
    private DateTime getStart()
    {
        return Start;
    }
    private ArrayList<Module> getMod()
    {
        return mod;
    }
}
