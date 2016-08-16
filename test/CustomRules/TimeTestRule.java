/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomRules;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;


/**
 *
 * @author Israel
 */
public class TimeTestRule {
    long start;
    @Before
    public void start() {
         start = System.currentTimeMillis();
    }

    @After
    public void end() {
      
        System.out.println(System.currentTimeMillis() - start);
    }
    @Test
    public void casodeprueba1()
    {
        assertNull("esnulo", null);
        for(int i = 0; i<1000000000;i++)
        {
            
        }
    }
}
