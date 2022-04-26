import java.util.Scanner;

public class Scan {
	public void add() {
		Scanner s = new Scanner(System.in);
System.out.println("enter the empid"  );
int empid=s.nextInt();
System.out.println(empid);
	}
//<<<<<<< HEAD
	
	
	
	
	public void test() {
		System.out.println("Hai this is test");
	}
//=======
	public void test1() {
System.out.println("Hai this is test");
//>>>>>>> 2f5ecf14d30eae6f59d6687cd83e03edcd208cfa
	}
	public static void main(String[] args) {
		Scan ss = new Scan();
		ss.add();
		ss.test();
	}

}
