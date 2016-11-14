import java.util.*;
public class Tester {

	public static void main(String[] args) {
		String sent;
		do {
			Scanner sentIN = new Scanner (System.in);
			System.out.print("Input a sentence and press ENTER: ");
			sent = sentIN.nextLine();
			sent = sent.concat("QQQQQQQQQQQQQQQ");
			sent = sent.toUpperCase();
			String sp[]= new String[500];
			sp=sent.split("([S]\\s+[A])|(SA)");
			int spleng= sp.length-1;
			if (!sent.equals("EXITQQQQQQQQQQQQQQQ"))
			System.out.println("There are " + spleng + " occurences.");
			
		}
		while(!sent.equalsIgnoreCase("EXITQQQQQQQQQQQQQQQ"));

	}

}
