import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Carte XX= new Carte(" Prima carte");
		XX.afisCarte();
	
		
		Subcapitole A = new Subcapitole("Subcap 1");
		Subcapitole B = new Subcapitole("Subcap 2");
		Subcapitole C = new Subcapitole("Subcap 3");
		
		ArrayList<Subcapitole> lista1 = new ArrayList<Subcapitole>();
		lista1.add(A);
		lista1.add(B);
		lista1.add(C);
		
		Capitol X = new Capitol(" Capitol 1 ",lista1);
		X.afisCap();
	
	
	}
	

}
