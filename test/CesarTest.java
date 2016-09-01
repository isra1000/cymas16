/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import PrimerParcial.Cesar;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Israel
 */
public class CesarTest {
    
    @RunWith(Parameterized.class)
public class TestCesar {
   private Integer number;
   private Boolean expectedResult;
   private Cesar cesar;
  

   @Before
   public void initialize() {
      cesar = new Cesar();
   }

  
	
   public TestCesar(Integer inputNumber, Boolean expectedResult) {
      this.number = inputNumber;
      this.expectedResult = expectedResult;
   }

   @Parameters
   public  Collection Cesar2Test()    
   {
       
      return Arrays.asList(new Object[][] {
         { "a", "a"+ number},
         
             
         
      });
      
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testPrimeNumberChecker() {
     System.out.println("el numero probado es" + number);
       assertEquals("Error en el numero" + number, expectedResult, cesar.toString());
   }
}
}
