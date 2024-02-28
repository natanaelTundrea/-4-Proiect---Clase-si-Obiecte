import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
//		System.out.println(90);
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
		
//		Complex a=new Complex(3, 4);
//		a.Print();
//		a.Print();
//		a=new Complex(2, 3);
//		a.Print();
//		System.out.println(Complex.NumarulDeAfisari());
		
		Sertar first=new Sertar(10,2,2);
		Sertar second=new Sertar(1,50,500);
		Birou masiv= new Birou(first, second, 9000, 9000, 8000);
		masiv.Print();
		

	}

}
