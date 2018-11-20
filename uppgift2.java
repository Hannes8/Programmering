import java.util.Scanner;

//Skapa ett program som läser in textrader från konsolen och avslutas när texten EXIT skrivs in.
public class uppgift2 {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String text="";
		
		System.out.println("Programmet avslutas om du skriver EXIT");
		
		while(!text.equals("EXIT")){
			
			
			text=input.next();
			
			
		}

			System.out.println("Programmet är nu avslutat");
		}
		
	}

