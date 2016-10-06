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
    private ArrayList<Student> students = new ArrayList<Student>();
    
    public Module(String name,String id)
    {
        this.moduleName = name;
        this.moduleID = id;
    }
    //setters 
    public void StudentReg(Student r)
    {
        students.add(r);
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
}
