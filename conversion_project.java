import java.util.*;
public class conversion_project {

	public static void main(String args[]) 
	{
		int num1, num2;
		double ans = 0;
		char operator;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number");
		num1 = scan.nextInt();
		System.out.println("enter second number");
		num2 = scan.nextInt();
		System.out.println("What operation?");
		operator = scan.next().charAt(0);
		
		switch (operator) {
		case '+': ans = num1 + num2;
				break;
		case '-': ans = num1 - num2;
				break;
		case '*': ans = num1 * num2;
				break;
		case '/': ans = num1/num2;
				break;
				
		
			
				}
		
		System.out.println(num1+" "+operator+" "+num2+ " = "+ans);
		
		
	}
}
