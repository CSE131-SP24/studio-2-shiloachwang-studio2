package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("How much money do you start with? ");
	double startAmount = in.nextDouble();
	System.out.println("What is the win probability? ");
	double winChance = in.nextDouble();
	System.out.println("What amount of money do you have to reach? ");
	double winLimit = in.nextDouble();
	System.out.println("How many days will you simulate? ");
	int totalSimulations = in.nextInt();
	System.out.println(" ");
	int ruinNumber = 0;
	double alpha = (1-winChance)/winChance;
	double expectedRuin = (((Math.pow(alpha,startAmount)-(Math.pow(alpha,winLimit)))/(1-Math.pow(alpha,winLimit));

	
	for(int day = 1; day <= totalSimulations; day++)
	{
	System.out.println("This is day " + day + ".");
	double moneyAmount = startAmount;
	int plays = 0;
	
	while (moneyAmount < winLimit && moneyAmount > 0)
	{
	double winChanceCurrent = (int)(Math.random() * (101) - 0);
	double winChanceInt = winChance * 100;
	//System.out.println(winChanceCurrent);
	//System.out.println(winChanceInt);
	if (winChanceCurrent > winChanceInt) 
	{
		moneyAmount = moneyAmount - 1; 
	}
	else 
	{
		moneyAmount = moneyAmount + 1;
	}
	//System.out.println(moneyAmount);
	plays++;
	}
	


	
	
	
	if(moneyAmount == 0)
	{
		System.out.println("Ruin!");
		ruinNumber++;
	}
	else
	{
		System.out.println("YOU WIN!!!");
	}
	System.out.println("You played " + plays + " times today.");
	System.out.println(" ");
	}

	
	
	
	}

}
