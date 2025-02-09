import java.util.Scanner;
import java.lang.Math;
import java.io.File;

class utepEats
{
	public static void main(String[] args) throws Exception
	{
		Scanner scnr1 = new Scanner(System.in);
		
		
		//All the variables:
		int menu = 0;
		String foodOption = "";
		String yesNo = "";
		int n = 0;
		int totalnum = 0;
		double add = 0;
		double totalPrice = 0;
		double totalTax = 0;
		int tipP = 0;
		double tip = 0.0000;
		int checkout;
		
		
		
		//Welcoming the user:
		System.out.println();
		System.out.println("	     Hello new customer,");
		System.out.println("	    Welcome to UTEP eats!");
		
		
		//The program starts:
		while (menu != 5)
		{
			
			File foodPrice = new File(".\\food.txt");
			Scanner scnr2 = new Scanner(foodPrice);
			int i = 1;
		
			System.out.println("----------------------------------------------");
			
			//Menu:
			System.out.println();
			System.out.println("-------------------- Menu --------------------");
			System.out.println("What would you like to do? (Choose option 1 to 5):");
			System.out.println("1. Add a food");
			System.out.println("2. View cart");
			System.out.println("3. Clear cart");
			System.out.println("4. Checkout");
			System.out.println("5. Exit");
			
			
			System.out.print("-");
			menu = scnr1.nextInt();
			System.out.println("----------------------------------------------");
			
			
			//if the user gives the wrong input:
			while (menu < 1 || menu > 5 )
			{
				System.out.println("....");
				System.out.println("Invalid input. Please put a valid option (1-5).");
				System.out.print("-");
				menu = scnr1.nextInt();
				System.out.println("----------------------------------------------");
			}
			
			
			//The Options for the Menu:
			if (menu == 1)
			{
				
				//to display the food prices:
				while (scnr2.hasNextLine())
				{
					System.out.println(scnr2.nextLine());
				}
				
				scnr2.close();
				//The user types the food they want:
				System.out.println();
				System.out.println("Please type the food you want to add:");
				System.out.print("-");
				scnr1.nextLine(); //to make the scanner below work.
				foodOption = scnr1.nextLine();
				
				
				//The food of the user's food option:
				switch (foodOption)
				{
					case "Burger":
						add = 12.00;
						break;
					
					case "Fries":
						add = 5.00;
						break;
					
					case "ChickenSandwich":
						add = 10.00;
						break;
					
					case "TurkeySandwich":
						add = 9.00;
						break;
					
					case "CaesarSalad":
						add = 8.00;
						break;
					
					case "Waffles":
						add = 10.50;
						break;
					
					case "ChickenStrips":
						add = 8.50;
						break;
					
					case "QuinoaBowl":
						add = 9.50;
						break;
					
					case "Nachos":
						add = 10.00;
						break;
					
					case "TunaSalad":
						add = 10.50;
						break;
					
					case "Tacos":
						add = 11.00;
						break;
					
					case "Cookie":
						add = 4.00;
						break;
					
					case "IceCream":
						add = 7.00;
						break;
					
					case "Soda":
						add = 2.50;
						break;
					
					case "MacAndCheese":
						add = 5.50;
						break;
					
					case "Juice":
						add = 3.00;
						break;
					
					case "Coffee":
						add = 2.50;
						break;
					
					case "Soup":
						add = 7.00;
						break;
					
					default:
						System.out.println("----------------------------------------------");
						System.out.println("Unavailable food.");
						i = 0;//to not let the user pur the number of quantity.
					
				}
				
				if(i == 1)
				{
					//The user is asked how many:
					System.out.println();
					System.out.println("How many would you like to add?");
					System.out.print("-");
					n = scnr1.nextInt();
					
					
					//Adds another food and udates the price:
					totalnum = totalnum + n;
					totalPrice = totalPrice + n*add;
				}
				
				
			}
			
			else if (menu == 2)
			{
				System.out.println("-------------------- Cart --------------------");
				
				System.out.print("Number of items: ");
				System.out.println(totalnum);
				
				System.out.println();
				
				System.out.print("Total price: $");
				System.out.println(totalPrice);
				
			}
			
			else if (menu == 3)
			{
				//Are you sure?
				System.out.println("Are you sure you would like to clear your cart? (yes/no)");
				System.out.print("-");
				scnr1.nextLine(); //to make the scanner below work.
				yesNo = scnr1.nextLine();
				
				switch (yesNo)
				{
					case "yes":
						System.out.println("-------------------- Cart --------------------");
						System.out.println("Your cart is now empty!");
						System.out.println();
						
						System.out.print("Number of items: ");
						System.out.println(totalnum = 0);
						
						System.out.println();
						
						System.out.print("Total price: $");
						System.out.println(totalPrice = 0);
						break;
					
					case "no":
						System.out.println("----------------------------------------------");
						System.out.println("Cart not changed. Going back to menu!");
						break;
					
					default:
						System.out.println("----------------------------------------------");
						System.out.println("???");
				}
				
				
			}
			
			else if (menu == 4)
			{
				System.out.println("Please choose an option: (1 or 2)");
				System.out.println("1. Delivery (+ $5 fee)");
				System.out.println("2. Pickup");
				System.out.print("-");
				checkout = scnr1.nextInt();
				
				
				//The wrong input:
				while (checkout < 1 || checkout > 2)
				{
					System.out.println("----------------------------------------------");
					System.out.println("....");
					System.out.println("Invalid input. Please a put valid option (1 or 2).");
					System.out.print("-");
					checkout = scnr1.nextInt();
				}
				
				
				//user selected delivery:
				if (checkout==1)
				{
					System.out.println("Provide your address:");
					System.out.print("-");
					scnr1.nextLine();
					String address = scnr1.nextLine();
					
					System.out.println("----------------------------------------------");
					
					System.out.println("Would like to provide a tip? (yes/no)");
					System.out.print("-");
					String noYes = scnr1.nextLine();
					
					switch (noYes) 
					{
						case "yes":
							System.out.println("How much? (%)");
							tipP = scnr1.nextInt();
							
							tip = totalPrice*(tipP/100) + 5; //the 5 is for the fee
							break;
						
						case "no":
							System.out.println("Ok!");
							tip = 5; //the 5 is for the fee
							break;
					}
					
				}
				
				System.out.println("----------------------------------------------");
				
				System.out.print("Number of items: ");
				System.out.println(totalnum);
				
				System.out.println();
				
				System.out.print("Total price: $");
				System.out.println(totalPrice + tip);
				
				System.out.println();
				
				totalTax = totalPrice + (totalPrice*0.0825);
				
				System.out.print("Total price with tax: $");
				System.out.println(totalTax + tip);
				
				
				//Credit card number:
				System.out.println("----------------------------------------------");
				System.out.println("Please enter your credit card number (16 digits):");
				long card = scnr1.nextLong(); 
				
				
				System.out.println();
				System.out.print("Success!");
				
				System.out.println();
				System.out.println();
				System.out.println("------------------- Receipt -------------------");
				
				System.out.print("Number of items: ");
				System.out.println(totalnum);
				
				
				System.out.print("Total price with tax: $");
				System.out.println(totalTax + tip);
				
				System.out.println("------------------- Receipt -------------------");
				System.out.println();
				System.out.println();
				
				
				break;
				
			}
			
		}
		
		//The program ends:
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("Thank you for shopping with UTEP eats! <3");

		scnr1.close();
		//Goodbye!
	}
	
}
