import java.io.*;
import java.util.*;

public class Day4 {
    private int age;	
  
	public Person(int initialAge) {
        if(initialAge<0)
        {
            age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else
        {
            age=initialAge;
        }
  		// Add some more code to run some checks on initialAge
	}

	public void amIOld() {
        if(age<13)
        {
            System.out.print("You are young.");
        }
        else
        {
            if(age>=13 && age<18)
            {
               System.out.print("You are a teenager.");          
            }
            else
            {
                System.out.print("You are old.");
            }
        }
  		// Write code determining if this person's age is old and print the correct statement:
        System.out.println(/*Insert correct print statement here*/);
	}

	public void yearPasses() {
  		// Increment this person's age.
        age++;
	}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
