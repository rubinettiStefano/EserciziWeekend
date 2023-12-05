package com.generation.spiegazione;

public class Person 
{
    public String name, surname;
	public int age;
    
	public Person(String name,String surname,int age)
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	public String getPresentation(String nomeInterlocutore)
	{
		String res = 	"Ciao "+nomeInterlocutore + " io mi chiamo "+this.name + 
						" "+ this.surname + " e ho " + this.age + " anni";			
		return res;
	}
	///aaaaaa
}
