/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fetch.pkgclass;
import java.util.*;

/**
 *
 * @author LuisGuillermo
 */
public abstract class ED_EdelAngelT_A04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner size = new Scanner(System.in);
        int n=size.nextInt();
        Secuencial main = new Secuencial();
        main.setV(main.Random(n));
        System.out.println(main.showV());
        
    }  
     
}
    
