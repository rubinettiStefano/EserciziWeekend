package com.generation.spiegazione;

import com.generation.library.Console;

public class EsempioAvvio 
{
    public static void main(String[] args) 
    {
        
        Person p = new Person("Stefano","Rubinetti",28);
		p.age = 29;
        Person p1 = new Person("Irene","Alieksieieva",28);
		
		Console.print(p1.getPresentation("Maria Rosaria"));
        Console.print(p.getPresentation("Giovanni Di Pietrantonio"));
      
    }
}
