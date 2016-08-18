/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomRules;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author Israel
 */
public class TimeTestRule1 implements TestRule{

    @Override
    public Statement apply(Statement tstmnt, Description d) {
        return new MyStatement (tstmnt);
    }
    

}
class TimeStatement extends Statement
{
    private final Statement stmt;
            TimeStatement(Statement stmt) {
                this.stmt=stmt;
            }
             @Test
    public void casodeprueba1()
    {
        assertNull("esnulo", null);
        for(int i = 0; i<1000000000;i++)
        {
            
        }
    }

    @Override
    public void evaluate() throws Throwable {
        long time = 0;
        try{
        System.out.println("La prueba tardo" + (System.currentTimeMillis()-time));
        stmt.evaluate();
        }
    
        finally
        {
        System.out.println("La prueba termino");
        }
    }
    
}
