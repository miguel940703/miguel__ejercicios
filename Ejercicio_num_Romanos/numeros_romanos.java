/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanos;
  import java.util.Scanner;
/**
 *
 * @author Perera
 */
public class Romanos {



    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String Miles[]={"","M","MM","MMM"};
      System.out.println("Ingresa numero entre 1 y 3999");
      int N = sc.nextInt();
     
      if(N>=1000){
           int u=(N%10)%10;
           int d=((N/10)%10)%10;
           int c=(N/100)%10;
           int m=N/1000;
      System.out.println(Miles[m]+Centena[c]+Decena[d]+Unidad[u]);
      }
      else{
      if(N>=100){  
           int u=N%10;
           int d=(N/10)%10;
           int c=N/100;
      
          System.out.println(Centena[c]+Decena[d]+Unidad[u]);
      }else{
          if(N>=10){
               int u=N%10;
               int d=(N/10)%10;
            
              System.out.println(Decena[d]+Unidad[u]);          
          }else{
               int u=N%10;
     
              System.out.println(Unidad[N]);          
          }
      }
      }          
    }
}
    
