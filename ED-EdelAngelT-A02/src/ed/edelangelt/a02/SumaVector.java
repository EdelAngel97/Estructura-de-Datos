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
public class SumaVector {
    public static int SumaVector(int[] v,int n){
        if (n==0){
            return v[n];
        }else{
            return SumaVector((n-1),v[n]) + v[n];
        }  
}
}
