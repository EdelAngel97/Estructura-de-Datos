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
public class Binaria extends Fetch implements Ordenamientos{
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

    @Override
    public void seleccion() {
        int menor,aux;
        for(int i=0; i<v.length;i++){
            menor=i;
            for(int j=i+1;j<v.length;j++){
                if(v[j]<v[menor]){
                    menor=j;
                }
            }
            if(i != menor){
            aux=v[i];
            v[i]=v[menor];
            v[menor]=aux;
}
    }
}

    @Override
    public void insercion() {
        for(int i=0;i<v.length;i++){
            int temp = v[i];
            int j = i-1;
            
            while((j>=0) && (v[j]>temp)){
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = temp;
        }
    }
    
    public void intercambio(int i,int j){
    int temp = v[j];
    v[j] = v[i];
    v[i] = temp;
    
}

    @Override
    public void burbuja() {
        for(int i=1;i<v.length;i++){
            for(int j=0;j<v.length;j++){
                if(v[j]>v[j+1]){
                    intercambio(j,j+1);
                }
            }
        }
    }

    
    public void mergesort(int start, int end) {
        int i = start;
        int j = end;
        int center;
        
        center= v[(i+j)/2];
        do{
            while(v[i]<center)
            {
                i++;
            }
             while(v[j]<center)
            {
                j--;
            }
            if(i<=j)
            {
                intercambio(i,j);
                i++;
                j--;
            }
        }
        
        while(i<=j);
        if(start<j){
            mergesort(start, j);
        }
        if(i < end){
            mergesort(i, end);
}
    }

    
    
    
}
