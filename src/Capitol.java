import java.util.ArrayList;

public class Capitol {
	
	String numeCap;
	ArrayList<Subcapitole> listaSubcapitole;
	
	public Capitol(String numeCap,ArrayList<Subcapitole> listaSubcapitole)
	{
		this.numeCap = numeCap;
		this.listaSubcapitole = listaSubcapitole;
	}
	
	public String getNumeCap()
	{
		return numeCap;
	}
	
	public ArrayList<Subcapitole> getSubcapitole()
	{
		return listaSubcapitole;
	}
	
	public void afisCap()
	{
		System.out.println("Nume cap: " + numeCap + "\nLista Subcap: " );
		for(int i= 0;i<listaSubcapitole.size();i++)
		{
			listaSubcapitole.get(i).afisSubcap();
		}
	}

}
