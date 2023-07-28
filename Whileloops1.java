import java.util.Scanner;
public class Whileloops1 {
public static void main(String[] args)
		    {
		        Scanner console = new Scanner(System.in);
		        int num;
		        int cont=1;
		        System.out.print("Enter any positive integer: ");
		        num = console.nextInt();
		                
		        System.out.println("Multiplication Table of " + num);	
		        while(cont<=20){
		        	int rest = cont*num; 
		        	System.out.println(cont+"*"+num+"="+rest);
		        	cont++;
		        	console.close();
		        }
	}//main
}//Part 1: While loops

