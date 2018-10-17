package AlannaBotscharowChapter4Pro1;
import java.util.Scanner; 

/*
 * Alanna Botscharow
 * 10/18
 * Chapter 4 program 1 
 * Find future dates
 */
public class Chapter4Program1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) 
				;
		//prompt user to enter an integer for today's day of the week. 
			//Sunday = 0, Monday = 1, ..., Saturday = 6.
				System.out.println("Enter a number for today's day (Sunday = 0, Monday = 1, ..., Saturday = 6): ");
				int  number = input.nextInt();
		
		//Prompt user to enter number of days after today for a future day. 
			//Enter the number of days elapsed since today: 
				System.out.println("Enter the number of days elapsed since today: ");
				int elapsed = input.nextInt(); 
				
				
					//Days of the week and future day
					    int futureDay = (elapsed + number)%7; 
						
						
				
						//if statements 
							if (number == 0) {
							
								System.out.println("Today is Sunday.");
							}
							else if (number == 1) {
								
								System.out.println("Today is Monday.");
							}
							else if (number == 2) {
								
								System.out.println("Today is Tuesday.");
							}
							else if (number == 3) {
								
								System.out.println("Today is Wednesday.");
							}
							else if (number == 4) {
								
								System.out.println("Today is Thursday.");
							}
							else if (number == 5) {
								
								System.out.println("Today is Friday.");
							}
							else if (number == 6) {
							
								System.out.println("Today is Saturday.");
							}
							else {
								System.out.println("Your number must be 0-6!");
							}
				
							
							
								if (futureDay == 0) {
									System.out.println("Your future day is Sunday");
								}
								else if (futureDay == 1) {
									System.out.println("Your future day is Monday");
								}
								else if (futureDay == 2) {
									System.out.println("Your future day is Tuesday");
								}
								else if (futureDay == 3) {
									System.out.println("Your future day is Wednesday");
								}
								else if (futureDay == 4) {
									System.out.println("Your future day is Thursday");
								}
								else if (futureDay == 5) {
									System.out.println("Your future day is Friday");
								}
								else if (futureDay == 6) {
									System.out.println("Your future day is Saturday");
								}
								else {
									System.out.println("Something went wrong");
								}
		//Display the future day of the week. 
			//Today is ____ and the future day is ___
		
							
			

	}

}
