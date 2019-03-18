import java.util.Scanner;

public class calci{

    public static void main(String[] args) {

    	double n1,n2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        n1 = s.nextDouble();
        System.out.print("Enter second number:");
        n2 = s.nextDouble();
        System.out.print("Enter an operator (+, *, /): ");
        char operator = s.next().charAt(0);

        s.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = n1+n2;
                break;
            case '/':
            	output = n1/n2;
                break;
            case '*':
            	output = n1*n2;
                break;
            default:
                System.out.printf("Entered invalid operator");
                return;
        }

        System.out.println(n1+operator+n2+": "+output);
    }
}