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
        this.End = end.plusYears(4); //based on a four year Course from todays date.
    }
    //setters
    public void setModules(ArrayList<Module> modules)
    {
        this.mod = modules;
    }   
    public void setCourse(String name)
    {
        this.courseName = name;
    }
    public void setStart(DateTime Start)
    {
        this.Start = Start;
    }
    public void setEnd(DateTime end)
    {
        this.End = end;
    }
    
    //add Module
    public void addMod(Module m)
    {
        mod.add(m);
    }   
    
    //getters
    public String getCourse()
    {
        return courseName;
    }
    public DateTime getend()
    {
        return End;
    }
    public DateTime getStart()
    {
        return Start;
    }
    public ArrayList<Module> getMod()
    {
        return mod;
    }
    // Override toString method
    @Override
    public String toString()
    {
        String str = " Course Name: " + this.courseName + "\n Start date: " + this.Start + "\n End Date: " + this.End + "\n";
        for (Module m : mod)
        {
            str += " \n" + m + "\n";
        }
        return str;
    }
}
