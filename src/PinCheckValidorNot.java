import java.util.Scanner;

public class PinCheckValidorNot {

	public static void main(String[] args) {
		

	        Scanner scanner = new Scanner(System.in);
	        int pin = 1234;
	        int no = 0;
	        System.out.println("ENTER YOUR PIN: ");
	        int entry = scanner.nextInt();
	        no++;
	        while (entry != pin && no < 3) {
	            System.out.println("Invalid Pin Try once Again ");
	            System.out.println("Enter pin: ");
	            entry = scanner.nextInt();
	            no++;
	        }
	        if (entry == pin)
	            System.out.println("\nCorrect, welcome back.");
	        else if (no >= 3)
	            System.out.println("\n“Sorry but you have been locked out.”");
	    }

	}


