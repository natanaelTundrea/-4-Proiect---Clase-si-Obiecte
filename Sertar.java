
public class Sertar {
	//variabilele definitorii
	public final int l, L, H;
	
	//constructorul
	public Sertar(int lungime, int latime, int inaltime)
	{
		this.l=lungime;
		this.L=latime;
		this.H=inaltime;
	}
	
	//afisarea
	public void Print()
	{
		System.out.println("Sertar: "+this.l+" l + "+this.L+" L + "+this.H+" H");
	}
}
