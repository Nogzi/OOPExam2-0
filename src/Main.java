import Data.Galaxy;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		
		/*
		 * A main for the program where one is suposed to do the different tasks in the assignment
		 * but the galaxy does not get set to a new galaxy
		 */
		Scanner scanner = new Scanner(System.in);
		int answer;
		Galaxy galaxy = new Galaxy();
		System.out.println("Welcome to Felix' OOP exam \n" +
				"please choose an assignment to run\n" +
				"----------------------------------\n" +
				"1: make a default galaxy\n" +
				"2: check if a galaxy is legal (make sure to make a galaxy first)\n" +
				"3: print a .txt with the players and each planet they own (make sure to make a galaxy first) (WIP skriver kun spillere og deres factions)\n" +
				"4: make a random galaxy\n" +
				"0: quit the program");
				
		do
		{
			answer = scanner.nextInt();
			switch (answer)
			{
				case 1:
					galaxy = galaxy.makeDefaultGalaxy();
					System.out.println("Default galaxy have been made");
					break;
				case 2:
					if (galaxy.getAmountOfSystems() == 0)
					{
						System.out.println("you have not made a galaxy yet");
						break;
					} else
					{
						try
						{
							galaxy.checkLegality();
							System.out.println("The galaxy is legal");
						} catch (Exception e)
						{
							e.getMessage();
							e.getStackTrace();
						}
					}
					break;
				case 3:
					if (galaxy.getAmountOfSystems() == 0)
					{
						System.out.println("you have not made a galaxy first");
						break;
					} else
					{
						galaxy.PrintGalaxy(galaxy);
						System.out.println("Galaxy have been printed");
					}
					break;
				case 4:
					galaxy = galaxy.makeRandomGalaxy();
					System.out.println("Random galaxy have been made");
					break;
				
				default:
					System.out.println("make sure to choose a valid option");
					break;
			}
		} while (answer != 0);
		
	}
}
