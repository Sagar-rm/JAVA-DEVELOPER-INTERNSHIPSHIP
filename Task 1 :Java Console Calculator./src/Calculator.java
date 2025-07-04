import java.util.Scanner;
public class Calculator {
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	public static double sub(double num1, double num2) {
		return num1 - num2;
	}
	public static double multi(double num1, double num2) {
		return num1 * num2;
	}
	public static double div(double num1, double num2) {
		 if (num2 == 0) {
	            System.out.println("Error: Cannot divide by zero.");
	            return 0;
	        }
	        return num1 / num2;
	    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter the first Number :-");
			double num1 = sc.nextDouble();
			
			System.out.println("Enter the second Number :-");
			double num2 = sc.nextDouble();		
			
			System.out.println("Choose an operator: + , - , * , /");
            char operator = sc.next().charAt(0);

			switch(operator) {
			
			case '+':
				System.out.println("Result: "+add(num1 , num2));
				break;
			case '-':
				System.out.println("Result: "+sub(num1 , num2));
				break;
			case '*':
				System.out.println("Result: "+multi(num1 , num2));
				break;
			case '/':
				System.out.println("Result: "+div(num1 , num2));
				break;
		    default:
                 System.out.println("Invalid operator!");
			
			}

            System.out.println("Do you want to continue? (yes/no):");
            String choice = sc.next().toLowerCase();
            if (!choice.equals("yes")) {
                flag = false;
                System.out.println("Calculator exited Thank you.");
			
		}
				
	}
        sc.close();

}
}
