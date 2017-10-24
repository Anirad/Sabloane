
public class Subcapitole {
	String numeSubc;
	Paragrafe paragrafe;
	Imagini imagini;
	Tabel tabel;
	
	public Subcapitole(String numeSubc)
	{
		this.numeSubc = numeSubc;
	}
	
	public String getSubc()
	{
		return numeSubc;
	}

	public void afisSubcap()
	{
		System.out.println(numeSubc);
	}
}
