package pkg03conditionalstmts;

public class SwitchStmtDemo {

	public static void main(String[] args) {
		
//		int iWeekDay = 1;
//		
//		switch(iWeekDay) {
//		case 1: System.out.println("Monday");
//		break;
//		case 2: System.out.println("Tuesday");
//		break;
//		case 3: System.out.println("Wednesday");
//		break;
//		default: System.out.println("Invalid week day.");
		
		char alphaVow = 'a';
		
		switch(alphaVow) {
		case 'a': System.out.println("Vowel");
		break;
		case 'k': System.out.println("Consonant");
		break;
		case 'o': System.out.println("Vowel");
		break;
		default: System.out.println("Invalid alpha.");
		}
	}
}
