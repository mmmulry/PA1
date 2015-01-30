import java.util.Scanner;
/*********************************************
Programmer: Meg Mulry
Course: CS201.02, Dr. Olsen
Date: 1/29/15
Programming Assignment: 1
Problem Statement: Calculates roommate's weekly pay with bonuses
Data In: Regular weekly pay before bonuses
         Number of bonuses earned in a particular week
         Money value of a bonus
Data Out: Money value of all bonuses combined
          Total weekly pay with bonuses
Credits: myprogramminglab.com and examples done in class 
*********************************************/
public class RoommateWeeklyPay
{
   public static void main(String[] args)
   {
      double PayBeforeBonuses; //will hold "pay before bonuses" input by user
      //user gives the pay before bonuses
      Scanner myScan=new Scanner(System.in);
      System.out.print("What is your regular weekly pay before bonuses?");
      PayBeforeBonuses=myScan.nextDouble();
      
      int NumberOfBonuses;//will hold number of bonuses input by user
      //user gives he number of bonuses
      System.out.print("How many bonuses did you earn this week?");
      NumberOfBonuses=myScan.nextInt();
      
      double SingleBonusValue;//will hold the money value of each bonus
      //user inputs the money value of a bonus
      System.out.print("How much is each bonus worth?");
      SingleBonusValue=myScan.nextDouble();
      
      
      double TotalBonusWorth;//will hold the value of the number of bonuses multiplied by the value of a bonus
      //Calculation for money value of all bonuses combined
      TotalBonusWorth=SingleBonusValue*NumberOfBonuses;
      
      double TotalWeekPay;//will hold the value of the pay before bonuses plus the value of all bonuses combined
      //calculation for total weekly pay with bonuses
      TotalWeekPay=PayBeforeBonuses + TotalBonusWorth;
      
      //output with money value in dollars and cents
      System.out.print("Your initial weekly pay of" + PayBeforeBonuses + "plus the value of the bonuses you've earned," + TotalBonusWorth + ", brings your final weekly pay to a total of" + TotalWeekPay + ".");
   }
}