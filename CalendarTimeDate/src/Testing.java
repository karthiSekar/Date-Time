import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
	
		B ob=new B();
		ob.go();
		B ob1=new B();
		ob1.go();
	}
}
class B{
	List<Integer> al=new ArrayList<>();
	Scanner s=new Scanner(System.in);
	void go(){
		al.add(s.nextInt());
		al.add(s.nextInt());
		System.out.println(al);
	}
}
