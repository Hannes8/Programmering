import java.util.Scanner;

public class Läxa {
	
	public static void main(String[] args) {
		
		System.out.println(volume(30));	
		
		System.out.println(count("abchejabc", 'c'));
		
		System.out.println(reverse("hej"));	
		
		System.out.println(sjorovare("Hej jag heter Hannes"));
		
		
	}
	
	public static double volume(double radius){
		
		double volym=(4*3.1415*radius*radius*radius)/3;
		
		return volym;
		
		}
	public static String reverse(String str) {
		
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			
			
			
			reverse = reverse + str.charAt(i);
		}
		
		
		
		
		return reverse;
		
	}
	

	public static int count(String str, char c) {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i)) == c) {	
				count++;
			}
		}
		
		return count;
		
		
	}
	public static String sjorovare(String str) {
		
	     char konsonanter[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'z', 'x','B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'Z', 'X'};
	        String result = "";
	        for(int i=0; i<str.length(); i++){
	        	
	            boolean x = false;
	            
	            for(int j=0; j<konsonanter.length; j++){
	                if(str.charAt(i) == konsonanter[j]){
	                    x = true;
	                    break;
	                }
	            }

	            if(x){
	                result += (str.charAt(i) + "o" + str.charAt(i));
	            }else{
	                result += str.charAt(i);
	            }
	        }
	        return result;
			
		
		
		
		
	
	}



	
	
	
	
}
