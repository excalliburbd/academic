//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 9a: Write a java program that prints the following sequences of values using loops:
//d) 2, -4, 6, -8, 10, -12

import static java.lang.System.*;
import java.util.*;

public class Task9d
{
	public static void main(String[] args)
	{
		for(int i=1, j=2; j<=12; i++, j+=2)
		{
			if(i%2==0)
				out.println(j*-2);
			else
				out.println(j);
		}

	}
}
