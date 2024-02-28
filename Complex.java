
public class Complex {
		//variabilele
		private double real=0, imaginar=0, modul=0;
		private static int nrPrints=0;
		
//		public static int getNrPrints() {
//			return nrPrints;
//		}
//
//		private static void setNrPrints(int nrPrints) {
//			Complex.nrPrints = nrPrints;
//		}

		//constructorul
		public Complex(double r, double i)
		{
			real=r;
			imaginar=i;
			modul=Math.sqrt(r*r +i*i);
		}
		
		// calculam modulul
		public double Modul() {return modul;}
		
		//afisam nr complex
		public void Print(){System.out.println(real+" + i * "+imaginar); Complex.nrPrints++;}
		
		//calculam adunarea
		public Complex Adunare(Complex x)
		{
			return new Complex(this.real+x.real, this.imaginar+x.imaginar);
		}
		
		//returnam numarul de afisari
		public static int NumarulDeAfisari()
		{
			return Complex.nrPrints;
		}
}
