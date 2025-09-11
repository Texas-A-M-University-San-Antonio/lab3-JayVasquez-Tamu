/**
* Name: [Jay Vasquez]
* Date: [Enter Today's Date]
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
*/
// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class Lab3_Jay_Vasquez
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double initialHomeValue, interestRate, finalHomeValue;
        int elapsedYears;

        System.out.println("Please enter the initial value of the home:  ");
        initialHomeValue = input.nextDouble();
        
        System.out.println("Please enter the number of years elapsed: ");
        elapsedYears = input.nextInt();
        
        System.out.println("Please enter the interest rate: ");
        interestRate = input.nextDouble();

        interestRate = interestRate / 100.0;
        
        finalHomeValue = initialHomeValue * Math.pow(1 + interestRate, elapsedYears);
        System.out.println("The final value of the home is " + finalHomeValue);
    }
} 