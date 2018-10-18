package p1morse;
import java.util.HashMap;
import java.util.Scanner;

public class P1morse {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String palabra= "";
        
        System.out.println("escribe la palabra a convertir en clave morse");
        palabra=in.nextLine();
        
        if(palabra.indexOf('.')!=-1 || palabra.indexOf('-')!=-1 ){
            
     HashMap<String, String> codigo=new HashMap<String,String>();
        
        codigo.put( ".-","a");
        codigo.put( "-...","b");
        codigo.put( "-.-.","c");
        codigo.put( "-..","d");
        codigo.put( ".","e");
        codigo.put( "..-.","f");
        codigo.put( "--.","g");
        codigo.put( "....","h");
        codigo.put( "..","i");
        codigo.put( ".---","j");
        codigo.put( "-.-","k");
        codigo.put( ".-..","l");
        codigo.put( "--","m");
        codigo.put( "-.","n");
        codigo.put( "---","o");
        codigo.put( ".--.","p");
        codigo.put( "--.-","q");
        codigo.put( ".-.","r");
        codigo.put( "...","s");
        codigo.put( "-","t");
        codigo.put( "..","u");
        codigo.put( "...-","v");
        codigo.put( ".--","w");
        codigo.put( "-..-","x");
        codigo.put( "-.--","y");
        codigo.put( "--..","z");
        codigo.put( ".----","1");
        codigo.put( "..---","2");
        codigo.put( "...--","3");
        codigo.put( "....-","4");
        codigo.put( ".....","5");
        codigo.put( "-....","6");
        codigo.put( "--...","7");
        codigo.put( "---..","8");
        codigo.put( "----.","9");
        codigo.put( "-----","0");
        codigo.put(" ", " ");
        
        
            String morse="";
       
    
            String[] cadenaseparada;
           cadenaseparada= palabra.split(" ");
           
           for (int i = 0; i< cadenaseparada.length; i++){
               morse +=codigo.get(cadenaseparada[i]) + " ";
               
           }
               System.out.println("Traduccion a español: "+ morse); 
       
        }
        
        else{
            
             HashMap<String, String> letra=new HashMap<String,String>();
        
        letra.put("a", ".-");
        letra.put("b", "-...");
        letra.put("c", "-.-.");
        letra.put("d", "-..");
        letra.put("e", ".");
        letra.put("f", "..-.");
        letra.put("g", "--.");
        letra.put("h", "....");
        letra.put("i", "..");
        letra.put("j", ".---");
        letra.put("k", "-.-");
        letra.put("l", ".-..");
        letra.put("m", "--");
        letra.put("n", "-.");
        letra.put("o", "---");
        letra.put("p", ".--.");
        letra.put("q", "--.-");
        letra.put("r", ".-.");
        letra.put("s", "...");
        letra.put("t", "-");
        letra.put("u", "..");
        letra.put("v", "...-");
        letra.put("w", ".--");
        letra.put("x", "-..-");
        letra.put("y", "-.--");
        letra.put("z", "--..");
        letra.put("1", ".----");
        letra.put("2", "..---");
        letra.put("3", "...--");
        letra.put("4", "....-");
        letra.put("5", ".....");
        letra.put("6", "-....");
        letra.put("7", "--...");
        letra.put("8", "---..");
        letra.put("9", "----.");
        letra.put("0", "-----");
        letra.put(" ", " ");
        
        
       String cmorse="";
       
       for (char c: palabra.toCharArray()){
           cmorse +=letra.get(c+ ""))+"   ";
       }
       System.out.println("Traduccion a morse: "+ cmorse);
            
        
        }
        
    }
    
    
}

