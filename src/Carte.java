
public class Carte {
	
	Autor autor;
	String titluCart;
	Cuprins cuprins;
//	Capitol capitol;
	
	public Carte(String titluCart)
	{
		this.autor = new Autor("Autor ");
		this.titluCart=titluCart;
		this.cuprins = new Cuprins("Cuprins ");
	}
	
	public void afisCarte()
	{
		System.out.println("Autor:  " + autor.getName() + "\nTitlu:  " + titluCart + "\nCuprins:  " + cuprins.getCuprins()  ) ;
	}
	
	

}
