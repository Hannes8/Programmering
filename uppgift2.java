import java.util.Scanner;

//Skapa ett program som l�ser in textrader fr�n konsolen och avslutas n�r texten EXIT skrivs in.
public class uppgift2 {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String text="";
		
		System.out.println("Programmet avslutas om du skriver EXIT");
		
		while(!text.equals("EXIT")){
			
			
			text=input.next();
			
			
		}

			System.out.println("Programmet �r nu avslutat");
		}
		
	}

