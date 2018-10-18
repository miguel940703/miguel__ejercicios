/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Perera
 */
public class Pherencia {
public static boolean salir = false;
public static Double lado;
  
    public static void main(String[] args)throws Exception {
       
        Scanner sn = new Scanner(System.in);
        int opcion; 
    
     while(!salir){
        if(lado != null){
            System.out.println("Valor guardado : " +lado);
            
        }else{
            //lado = 0;
            System.out.println("Ingrese valor de lado :");
            lado = sn.nextDouble(); 
        }
        System.out.println("** Opcion 1 => Calcular Perimetro Cuadrado");
             System.out.println("** Opcion 2 => Calcular Area Cuadrado");
             System.out.println("** Opcion 3 => Calcular Volumen Cubo ");
             System.out.println("** Opcion 4 => Calcular Perimetro Cubo ");
             System.out.println("** Opcion 5 => Ingresar Valor Nuevamente ");
             System.out.println("** Opcion 6 => Salir ");
            
         try {
             
                 System.out.println("\nElige una opcion :");
                 opcion = sn.nextInt();
  
                 switch (opcion) {
                     case 1:
                    operaciones(lado,1);
                         break;
                     case 2:
                    operaciones(lado,2);
                         break;
                     case 3:
                    operaciones(lado,3);
                         break;
                     case 4:
                    operaciones(lado,4);
                         break;
                    case 5:
                        lado = null;
                        salir = false;
                         break;
                     case 6:
                         salir = true;
                         System.out.println("Fin Sistema");
                         break;
                     default:
                         System.out.println("Solo números entre 1 y 3");
                 }
             } catch (InputMismatchException e) {
                 System.out.println("Debes insertar un número");
                 sn.next();}
     }
    }
public static Double operaciones(Double lado,Integer opcion){
    figura figura2;
    Double resultado = null;

    Scanner sn = new Scanner(System.in);
              switch (opcion) {
             
              case 1:
              figura2 =new cuadrado(lado);
                
              System.out.println("El Perimetro de un cuadrado es: "+figura2.getPerimetro());
                         
              break;
              case 2 : 
              
              figura2 = new cuadrado(lado); 
              resultado = figura2.getArea();
              System.out.println("El Area de un cuadrado es : "+figura2.getArea());;
              break;
              case 3 : 
              figura2 =new cubo(lado);
              resultado = figura2.getArea();
              System.out.println("El Volumen de un cubo: "+figura2.getArea());
              
              break;
              case 4 : 
              figura2 =new cubo(lado);  
              resultado = figura2.getPerimetro();
              System.out.println("El Perimetro de un cubo: "+figura2.getPerimetro());
              
              break;
              default : 
              System.out.println("\nEliga entre las opcion 1,2,3,4 \n");
              opcion = sn.nextInt();
              }
              System.out.println("1.- Continuar con mismo valor ");
              System.out.println("2.- Ingresar nuevo valor ");
              System.out.println("3.- Salir \n");
              Integer continu = sn.nextInt();
              continuar(continu);
return resultado;    
}
  public static void continuar(Integer opcion){
    if(opcion == 2){salir = false;}
    if(opcion == 3){
    salir = true;
      System.out.println("Fin Sistema");
    }
    
    }

    }
    
    
