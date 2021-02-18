/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odernarnumeros;

import java.util.Scanner;

/*
Ejercicio 1: Pedir tres números presentarlos ordenados de menor a mayor
*/

public class Ordenar {
    //declaracion de variables de nunmeros a ingresar
   private int num1,num2,num3;
  
 public void ingresarDatos(){
     //ingresar por teclado los numeros
    Scanner tecla = new Scanner(System.in);
    System.out.print("Ingrese Primer Numero: ");
    num1 = tecla.nextInt();
    System.out.print("Ingrese Segundo Numero: ");
    num2 = tecla.nextInt();    
    System.out.print("Ingrese Tercer Numero: ");
    num3 = tecla.nextInt();
    //llamada al metodo de ordeamiento
    OrdenaNum();
 }
 public void OrdenaNum() {
    //verificar el mayor con todas las combinaciones de los numeros ingresados
    if(num1>num2 && num2>num3){
       System.out.print("\nOrdenado de Mayor a Menor es: \n"+num1+"\n"+num2+"\n"+num3+"\n");
    }else if(num1>num3 && num3>num2){
       System.out.print("\nOrdenado de Mayor a Menor es: \n"+num1+"\n"+num3+"\n"+num2+"\n");
    }else if(num2>num1 && num1>num3){
       System.out.print("\nOrdenado de Mayor a Menor es: \n"+num2+"\n"+num1+"\n"+num3+"\n"); 
    }else if(num2>num3 && num3>num1){
       System.out.print("\nOrdenado de Mayor a Menor es: \n"+num2+"\n"+num3+"\n"+num1+"\n"); 
    }else if(num3>num1 && num1>num2){
       System.out.print("\nOrdenado de Mayor a Menor es: \n"+num3+"\n"+num1+"\n"+num2+"\n"); 
    }else if(num3>num2 && num2>num1){
       System.out.print("\nOrdenado de Mayor a Menor es: \n"+num3+"\n"+num2+"\n"+num1+"\n");
    }
    }
 
   public void imprime(){
       
 
}    
}
