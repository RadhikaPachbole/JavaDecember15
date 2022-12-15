import java.util.Scanner;

public class positivEvenOdd {

	public static void main(String[] args) {
		int count1=0,count2=0;
		int num1,num2,num3,num4;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		num1=input.nextInt();
		num3=num1;
		System.out.print("Enter Second Number: ");
		num2=input.nextInt();
		num4=num2;
		System.out.println("Odd Numbers: ");
		while(num1 <= num2) {
		if(num1%2 != 0) {
		System.out.println(num1);

		}
		if(num1%2!= 0) {
		count1+=num1;
		}
		num1++;
		}
		System.out.println("Sum Of Even Numbers: "+count1);
		System.out.println("even Numbers: ");
		while(num3 <= num4) {
		if(num3%2 == 0) {
		System.out.println(num3);

		}
		if(num3%2== 0) {
		count2+=num3;
		}
		num3++;
		}
		System.out.println("Sum Of even Numbers: "+count2);
	}

}
