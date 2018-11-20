import java.util.Scanner;

public class uppgift66 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
	     for(int i=0;i<x;i++) {
	         for(int j=0;j<x-i;j++){
	             System.out.print(" ");
	         }
	        for(int y=0;y<=i;y++) {
	            System.out.print("x ");
	        }
	        System.out.println();  
	    }

	}
	 
	 
}

