
import java.util.Scanner;
public class UserInput {

	public static void main(String Args[]) {
		Scanner in  = new Scanner(System.in);
		System.out.print("ENTER YOUR NAME:");
		String name = in.nextLine();
		
		
		//print out information
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER YOUR AGE:");
		int user_input_number = scan.nextInt();
		
		Scanner employment = new Scanner(System.in);
		System.out.println("OCCUPATION:");
		String occupation = in.next();
		
		Scanner education = new Scanner(System.in);
		System.out.println("SCHOOL NAME:");
		String school = in.next();
		
		Scanner line = new Scanner(System.in);
		System.out.println("ENTER YOUR ADDRESS:");
		String address = in.next();
		System.out.println("Hello " + name + ", you are " + user_input_number + " years old. Your occupation is " + occupation + ". Your school's name is " + school + ". Your address is" + address);  
		
	}
} 
