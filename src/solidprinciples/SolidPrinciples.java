/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidprinciples;

import Util.Addition;
import Util.MathsCommand;
import Util.Subtract;

/**
 *
 * @author Ripesh
 */
public class SolidPrinciples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MathsCommand cmd = new Subtract();
        System.out.println(cmd.Calculate(4, 2));
       
        
            
    }
    
}
