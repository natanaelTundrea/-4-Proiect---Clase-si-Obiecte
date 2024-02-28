
public class ClientComplex {

	public static void main(String[] args) {
		Complex firstComplex = new Complex(2,3);
		firstComplex.Print();
		System.out.println(firstComplex.Modul());
		
		Complex secondComplex = new Complex(5,1);
		secondComplex.Print();
		System.out.println(secondComplex.Modul());
		
		Complex suma=firstComplex.Adunare(secondComplex);
		suma.Print();
	}

}
