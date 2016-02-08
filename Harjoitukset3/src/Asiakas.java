
public class Asiakas extends Henkilö{
	
	private int asiakasnumero; 
	private int luottoraja; 
	private String tilinumero;
	private String asiakastunnus;
	
	private Asiakas(){
		asiakasnumero = 0;
		luottoraja = 0;
		tilinumero = "Ei asetettu";
	}
	
	public String toString(){
		String tulos = super.toString() + " "+asiakasnumero+" "+luottoraja+" "+tilinumero;
		return tulos;
	}
	
	public static void main(String[] args) {
	
		Asiakas eka = new Asiakas();
		eka.setIka(25);
		System.out.println(eka);
		

	}

}
