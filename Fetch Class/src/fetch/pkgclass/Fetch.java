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
public abstract class Fetch {
    int [] v;
    
public int[] getV(){
    return this.v;
    }
    
public void setV(int[] v){
    this.v = v;
}
    
public int[] Random(int n){
    int [] v = new int[n];
    Random rnd = new Random();
    for(int i=0;i<v.length;i++){
        v[i] = rnd.nextInt();
    }
return v;
}
   
public String showV(){
    String show;
    show = "";
    for(int i=0;i<v.length;i++){
        show = show + v[i];
        if(i<v.length-1){
            show = show + ", ";
        }   
    }
return show;
}
    
public void showF(int n){
    System.out.println("El numero encontrado es:" + n);
    }
}
