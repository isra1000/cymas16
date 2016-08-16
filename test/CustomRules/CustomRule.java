/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomRules;

import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author Israel
 */
public class CustomRule implements TestRule{

    @Override
    public Statement apply(Statement stmnt, Description d) {
        return new MyStatement (stmnt);
    }
    

}
class MyStatement extends Statement
{
    private final Statement stmt;
            MyStatement(Statement stmt) {
                this.stmt=stmt;
            }

    @Override
    public void evaluate() throws Throwable {
        try{
        System.out.println("Esta prueba fue hecha por mi");
        stmt.evaluate();
        }
        finally
        {
        System.out.println("La prueba termino");
        }
    }
    
}
