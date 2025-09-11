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

        double initialValue, interestRate, finalValue;
        int numberOfYearsElapsed;

        initialValue = input.nextDouble();
        System.out.println("Please enter the initial value of the home:  ");

        numberOfYearsElapsed = input.nextInt();
        System.out.println("Please enter the number of years elapsed: ");

        interestRate = input.nextDouble();
        System.out.println("Please enter the interest rate in decimals: interestRate++");

        finalValue = initialValue * Math.pow(interestRate, numberOfYearsElapsed);
        System.out.println("The final value of the home is: ");
    }
} 