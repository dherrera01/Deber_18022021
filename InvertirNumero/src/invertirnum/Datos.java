/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertirnum;

import java.util.Scanner;

/**
 *
 * Ejercicio 2) Pedir un número de 5 cifras e imprimirlo en orden contrario: 12345, y 54321
 */
public class Datos {
    /*Definir variables*/
    private int num1,resto;     
    int invertido=0;
    public void ingresarDatos(){
     //ingresar por teclado los numeros
    Scanner tecla = new Scanner(System.in);
    System.out.print("Ingrese el Numero: ");
    num1 = tecla.nextInt();    
    //llamada al método Invertido
    Invertido();
 }
    public void Invertido() {
     /*El while reccore el numero ingresado*/                                                      
    while(num1!=0){
    /*Guarda el resto de la división del numero y 10,para asi guardar cada dígito */
         resto=num1%10;
    /*Disminuye el numero para asi poder utilizar el digito siguiente*/                  
         num1=num1/10;         
    /*Invierte el número directamente*/                
         invertido=invertido*10+resto;         
       }
    /*Imprime el número invertido*/
      System.out.println("Numero invertido: "+invertido);
    }
}
