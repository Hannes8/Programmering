import java.util.Scanner;
//Skriv ett program som l�ser in en f�ljd av tal och multiplicerar ihop dem. 
//Inl�sningen ska avbrytas d� produktens belopp �verstigit 100 000 eller d� 10 st tal skrivits in. 
public class Uppgift3 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		double tal=0;
		double summa=1;
		System.out.println("Please write nummbers!");
		int x=0;
		
		while (summa <=100000) {
			tal=input.nextDouble();
			summa=summa*tal;
			
			x=x+1;
			
			if(x>9) {
				break;
			}
			
			System.out.println(summa);
			
		}
		
	}
	
	
}
