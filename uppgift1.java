import java.util.Scanner;
//	Skapa ett program som l�ser in tal fr�n konsolen och n�r man skriver in talet 0 ska den skriva ut summan av alla tal.

public class uppgift1 {
	public static void main(String[] args) {

	
	
	
	double tal=1;
	double summa=0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please type a nummber");
	
	
	while (tal != 0) {
		tal=input.nextDouble();
		summa +=tal;	
	
	
	}
	System.out.println("The sum of all nummber is " + summa);
	input.close();
	}
}
