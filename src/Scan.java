import java.util.Scanner;

public class Scan {
	public void add() {
		Scanner s = new Scanner(System.in);
System.out.println("enter the empid"  );
int empid=s.nextInt();
System.out.println(empid);
	}
	public static void main(String[] args) {
		Scan ss = new Scan();
		ss.add();
	}

}
