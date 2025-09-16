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
        int elapsedYears;
        // I declare the variables initialHomeValue, interestRate and finalHomeValue and ELAPSED_YEARS.
        //These 3 variables are floating points so I declare them as double.
        //elapsedYears is a constant so I declare it as a int.

        System.out.println("Please enter the initial value of the home:  ");
        initialHomeValue = input.nextDouble();
        //The user is now prompted to enter the variable for InitialHomeValue.
        
        System.out.println("Please enter the number of years elapsed: ");
        elapsedYears = input.nextInt();
        //The User is also prompted to enter the variable for ELAPSED_YEARS.

        System.out.println("Please enter the interest rate: ");
        interestRate = input.nextDouble();
        //The user is again prompted to enter the variable for interestRate.

        interestRate /= 100;
        //I use assigment operators to multiply interestRate and change to decimal.
        //This is a necessary assigment to prepare for the formula.

        finalHomeValue = initialHomeValue * Math.pow(1 + interestRate, elapsedYears);
        //This is the formula to calculate the finalHomeValue.

        System.out.println("The final value of the home is " + finalHomeValue);
        //The result is displayed as output to the user.
    }
} 