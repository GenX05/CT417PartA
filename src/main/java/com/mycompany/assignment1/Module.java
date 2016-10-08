/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;

import java.util.*;

/**
 *
 * @author
 * Mark Walsh
 * 12100937
 * CT417
 */
public class Module
{
    //decalre Variables 
    private String moduleName;
    private String moduleID;
    private ArrayList<Student> students = new ArrayList<>();
    
    public Module(String name,String id)
    {
        this.moduleName = name;
        this.moduleID = id;
    }
    
    //setters 
    public void StudentReg(Student s)
    {
        students.add(s);
    }
    public void setMod(String name)
    {
        this.moduleName = name;
    }
    public void setId(String id)
    {
        this.moduleID = id;
    }
    
    //getters
    public String getModName()
    {
        return moduleName;
    }
    public String getModID()
    {
        return moduleID;
    }
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    
    @Override
    public String toString()
    {
        String str = "Module: " + this.moduleName + " ID: " + this.moduleID + "\n";
        for (Student s : students)
        {
            str += "  " + s + "\n";
        }
        return str;
    }
    
}
