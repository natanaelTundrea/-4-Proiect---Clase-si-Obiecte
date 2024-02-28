
public class Birou {
		//continutul de sertare (sertare pe verti
		public final Sertar a;
		public final Sertar b;
		public final int l, L, H;
		
		//constructorul
		public Birou(Sertar a, Sertar b, int l, int L, int H)
		{
			this.a=a;
			this.b=b;
			this.l=l;
			this.L=L;
			this.H=H;
		}
		
		//afisare
		public void Print()
		{
			System.out.println("Primul sertar: ");
			this.a.Print();
			System.out.println("Cel de al doilea sertar: ");
			this.b.Print();
			System.out.println("Dimensiuniile biroului: "+this.l+" l + "+this.L+" L + "+this.H+" H");
			
		}
}
