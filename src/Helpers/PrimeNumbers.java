/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import static java.lang.Double.sum;
import static java.lang.Integer.sum;

/**
 *
 * @author Israel
 */
public class PrimeNumbers {
    public boolean isPrime(Integer num)
    {
        for (int i = 2; i < (num/2); i++) {
            if(num % 1 == 0){
                return false;
            }
        }
        return true;
    }
    
    public boolean isNatural(Integer num)
    {
        int sum =0;
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                {
                    sum +=i;
                }
            
               
            }
        }
    return (sum == num)?true:false;
    }
}
