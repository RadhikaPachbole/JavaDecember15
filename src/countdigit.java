import java.util.Scanner;

public class countdigit {
	
	 static long countdigit(long n) {
		
		    if(n/10 == 0)
		    return 1;
			return 1 + countdigit(n/10);
		}
		
		
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		long n=sc.nextLong();
		
		System.out.println("Number Of Digits : "+countdigit(n));
	}

	

}
