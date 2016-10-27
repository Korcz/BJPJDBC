package korczak.jakub.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Patient
{
	private int id;
	private String name;
	private String surname;
	private String ilness;
	//private LocalDate birthDate;
	private int age;
	
	
	public Patient(int id, String name, String surname, String ilness, int age/*int year, int month, int dayOfMonth*/)
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.ilness = ilness;
		//this.birthDate = LocalDate.of(year, month, dayOfMonth);
		this.age = age;
	}
	public Patient()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Entr surname");
		surname = sc.nextLine();
		/*System.out.println("Enter birth year");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("Enter birth month");
		int month = Integer.parseInt(sc.nextLine());
		System.out.println("Enter birth day");
		int dayOfMonth = Integer.parseInt(sc.nextLine());
		this.birthDate = LocalDate.of(year, month, dayOfMonth);*/
		System.out.println("Enter age");
		age = Integer.parseInt(sc.nextLine());
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSurname()
	{
		return surname;
	}
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	public String getIlness()
	{
		return ilness;
	}
	public void setIlness(String ilness)
	{
		this.ilness = ilness;
	}
	/*public LocalDate getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
	}*/
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/*public int calculateAge()
	{
		LocalDate currentDate = LocalDate.now();
		if ((birthDate != null) && (currentDate != null))
		{
			return Period.between(birthDate, currentDate).getYears();
		} else
		{
			return 0;
		}
	}*/
	
	@Override
	public String toString()
	{
		return "Patient [id=" + id + ", name=" + name + ", surname=" + surname + ", ilness=" + ilness + ", age=" + age + "]";
	}
	
	
}
