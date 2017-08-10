/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.edelangelt.a02;


/**
 *
 * @author LuisGuillermo
 */
public class EDEdelAngelTA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Factorial.factorial(5));
        int[] v= {10,20,30,20};
        System.out.println(SumaVector.SumaVector(v, v.length-1));
        System.out.println(MultiplicacionVector.MultiplicacionVector(v, v.length-1));
        
    }
    
}
