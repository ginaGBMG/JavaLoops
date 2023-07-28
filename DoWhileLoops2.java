import java.util.Scanner;
public class DoWhileLoops2 {
public static void main(String[] args) {
    Scanner console = new Scanner(System.in); 
    int a = console.nextInt();
    int num1= 0;
    int num2= 1;
    int rest ;
    int cont= 0;
    
    System.out.println(num1);
    System.out.println(num2);
    do {
    	rest =num1 + num2;
    			System.out.println(rest);
    			num1 = num2;
    			num2 = rest;
    			cont++;
 	
    } while (cont <= a );
	console.close();
    
	}//main - 0 1 1 2 3 5 8 13 21 34 55 89 ...
}//Part 2: Do While loops - 

