/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //programa que llene una matrz de 10 elementos
        //luego imprima numero de pares e impares
        
        int cantpar=0;
        int cantimpar=0;
        Scanner leer = new Scanner(System.in);
        
        int[] datos = new int[10];
        
        System.out.print("Llene el arreglo con 10 Registros \n");
        for(int i=0; i<=9; i++){
        datos[i]= leer.nextInt();
        
        if(datos[i]%2==0){
        cantpar++;
        }else{
        cantimpar++;
        }
        
        }
        System.out.print("Hay" + cantpar +"Numeros Pares \n");
        
        System.out.print("Hay" + cantimpar +"Numeros Impares \n");
    }
    
    
    
}
