/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;

import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 * Mark Walsh
 * 12100937
 * CT417
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    // test to ensure students name is being correctly assigned
    @Test 
    public void testusername(){
        DateTime dt = new DateTime();        
        Student std = new Student("john","17",dt);
        String username =std.Username;
        assertEquals("john17", username);
    }
}
