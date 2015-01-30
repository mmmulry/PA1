import java.util.Scanner;
public class RoommateWeeklyPay
{
   public static void main(String[] args)
   {
      double PayBeforeBonuses;
      Scanner myScan=new Scanner(System.in);
      System.out.print("What is your regular weekly pay before bonuses?");
      PayBeforeBonuses=myScan.nextDouble();
      
      int NumberOfBonuses;
      System.out.print("How many bonuses did you earn this week?");
      NumberOfBonuses=myScan.nextInt();
      
      double SingleBonusValue;
      System.out.print("How much is each bonus worth?");
      SingleBonusValue=myScan.nextDouble();
      
      
      double TotalBonusWorth;
      TotalBonusWorth=SingleBonusValue*NumberOfBonuses;
      
      double TotalWeekPay;
      TotalWeekPay=PayBeforeBonuses + TotalBonusWorth;
      
      System.out.print("Your initial weekly pay of" + PayBeforeBonuses + "plus the value of the bonuses you've earned," + TotalBonusWorth + ", brings your final weekly pay to a total of" + TotalWeekPay + ".");
   }
}