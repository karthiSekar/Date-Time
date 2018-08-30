//Sample for finding the working hour of an employee
import java.time.Clock;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Time {
public static void main(String[] a)
{Scanner ss=new Scanner(System.in);
	List<String> Students=new ArrayList<>();
	Calendar c=Calendar.getInstance();
	Students.add("Ram");
	Students.add("Arav");
	LocalTime mrngcheckin=LocalTime.of(9, 30);

	for(String s:Students)                                      
	{System.out.println("enter Hour and Minute of Check-in");
		int h=ss.nextInt();
		int m=ss.nextInt();
		LocalTime ob=LocalTime.of(h,m);
		Duration d=Duration.between(mrngcheckin,ob);
		if(d.isNegative())
		{
			Duration early=Duration.between(ob,mrngcheckin);
			System.out.println("Early by"+early);
		}
		else{
		System.out.println("delayed by"+d);}
		System.out.println("enter Hour and Minute of Check-out");
		int h1=ss.nextInt();
		int m1=ss.nextInt();
		LocalTime ob1=LocalTime.of(h1,m1);
		Duration workinghr=Duration.between(ob, ob1);
		System.out.println("You have worked for"+workinghr);
		
	
		
		
	}
	
}
}
