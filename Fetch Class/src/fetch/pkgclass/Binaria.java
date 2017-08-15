/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fetch.pkgclass;

/**
 *
 * @author LuisGuillermo
 */
public class Binaria extends Fetch{
    public int Fecth(int numero){
        int n = v.length;
        int inicio = 0;
        int centro;
        int fin = n-1;
        
    while(inicio <= fin){
        centro = (inicio + fin)/2;
        
        if(v[centro] == numero)
          return numero;
        
        if(numero < v[numero]){
          fin = centro-1;
    }else{
        inicio = centro+1;   
            }    
    } 
    return -1;
}
}
