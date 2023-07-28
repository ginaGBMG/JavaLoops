import java.util.Scanner;
public class ForLoops3 {
public static void main(String[] args) {
    Scanner console = new Scanner(System.in); 
    String nombre = console.next();  //v
    int longitud = nombre.length(); //variables
    for ( int cont=0; cont < longitud; cont++) { //3 things    	
    	char letra = nombre.charAt(cont);
    	System.out.println(letra);
    	console.close();
    }
	}//main
}//Ejercicio Part 3: For loops

