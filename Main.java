import java.util.Scanner;

/**
 *This program figures out the users intrest rate based on their input
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user for their investing amount
    System.out.println("Please enter a starting balance");
    double startingBalance = input.nextDouble();

    //asks user for their interest rate
    System.out.println("Please enter your interest rate");
    double interest = input.nextDouble();
    //double for decimal intrest
    double interestPercentage = interest / 100;

    //asks user for number of years they are going to invest 
    System.out.println("Please enter the number of years you will invest for");
    double years = input.nextInt();

    //double for final costs and interest gain
    double intrestGain = 0;
    double finalCost = 0;
    
    

    //for loop for calculatoing costs
    for (double yearAccumulator = 1; yearAccumulator <= years; yearAccumulator++){
      //calculates sum for the first year
      if(yearAccumulator == 1){
        //calculates interestgain
        intrestGain = startingBalance * interestPercentage;
        //adds interest gain
        finalCost = startingBalance + intrestGain;
        //calculates for rest of the years
      }else{
        //takes ammount from previous years and calculates new ammount
        finalCost = (finalCost * interestPercentage) + finalCost;
      }
      
    }
    //prints final amount
    System.out.println("Your final balance would be " + "$" + finalCost);


    
  }
}
