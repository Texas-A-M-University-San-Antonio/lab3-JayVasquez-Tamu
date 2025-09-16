/**
* Name: [Jay Vasquez]
* Date: [09/16/2025]
* Purpose: Lab3 - 
* [I am writing a program to calculate the compound interest or final value of a home.]
*/
// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;
//Here, I import the the utility Scanner so users can input variables.


//Here, I initiate the class and main.
public class Lab3_Jay_Vasquez
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        //Here, I initiate the utility Scanner for the user.

        double initialHomeValue, interestRate, finalHomeValue;
        final double ELAPSED_YEARS;
        // I declare the variables initialHomeValue, interestRate and finalHomeValue and ELAPSED_YEARS.
        //These 3 variables are floating points so I declare them as double.
        //ELAPSED_YEARS is a pure constant so I declare as a final.

        System.out.println("Please enter the initial value of the home:  ");
        initialHomeValue = input.nextDouble();
        //The user is now prompted to enter the variable for InitialHomeValue.
        
        System.out.println("Please enter the number of years elapsed: ");
        ELAPSED_YEARS = input.nextInt();
        //The User is also prompted to enter the variable for ELAPSED_YEARS.

        System.out.println("Please enter the interest rate: ");
        interestRate = input.nextDouble();
        //The user is again prompted to enter the variable for interestRate.

        interestRate /= 100;
        interestRate += 1;
        //I use assigment operators to divide interestRate by 100 and add 1.
        //The assigments changed interestRate to a decimal and add 1.
        //This is a necessary assigment to prepare for the formula.

        finalHomeValue = initialHomeValue * Math.pow(interestRate, ELAPSED_YEARS);
        //This is the formula to calculate the finalHomeValue.

        System.out.println("The final value of the home is " + finalHomeValue);
        //The result is displayed as output to the user.
    }
} 