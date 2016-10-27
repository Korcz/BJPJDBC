package korczak.jakub.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import korczak.jakub.database.Database;

public class Main
{
	public static void insertData()
	{
		Database.insertDoctor("Steven", "Strange", 325000);
		Database.insertPatient("Jack", "Nicholson", "Schizophrenia", 79);
	}
	public static void showMenu()
	{
		String printMenu = "===============\nMENU - HOSPITAL\n===============\n";
		printMenu += "Choose an option:\n";
		printMenu += "\t1.Find doctor (by ID)\n";
		printMenu += "\t2.Show all doctors\n";
		printMenu += "\t3.Delete doctor (by ID)\n";
		printMenu += "\t4.Find patient (by ID)\n";
		printMenu += "\t5.Show all patients\n";
		printMenu += "\t6.Delete patient (by ID)\n";
		printMenu += "\t7.Show average age of patient\n";
		printMenu += "\t8.EXIT PROGRAM";

		System.out.println(printMenu);
		System.out.print("Your option is: ");
	}
	
	public static int optionChoice()
	{
		Scanner inputOption = new Scanner(System.in);
		int choice = Integer.parseInt(inputOption.nextLine());
		return choice;
	}

	public static void functionSwitcher()
	{
		Scanner inputOption = new Scanner(System.in);
		
		boolean isExit = false;

		while (isExit == false)
		{
			showMenu();
			switch (optionChoice())
			{
			case 1:
				System.out.println("Enter doctor ID");
				int choiceD = Integer.parseInt(inputOption.nextLine());
				System.out.println(Database.selectOneDoctor(choiceD));
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("Program closed");
				isExit = true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Wrong choice! Try again.");
				break;
			}
		}
	}

	public static void main(String[] args)
	{
		Database.connect();
		Database.createTables();
		
		functionSwitcher();
		
		/*
		Database.insertVisit(1, 1, "Baker Street");*/
		
		//Database.deleteDoctor(3);
		//Database.deletePatient(3);
		//System.out.println(Database.avgAgeOfPatient());
		//Database.innerJoin();
		
		
		
	}

}
