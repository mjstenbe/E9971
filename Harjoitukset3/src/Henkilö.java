
public class Henkil� {

	// Luokkamuuttujat
	private String nimi;
	private int ika;

	// Konstruktori
	public Henkil�(String uusiNimi){
		nimi = uusiNimi;
		ika = 0;
	}
	public Henkil�(){
		nimi = "Ei annettu";
		ika = 0;
	}
	// getterit ja setterit
	
	public void setIka(int uusiIka){
	ika = uusiIka;	
	}
	
	public String toString(){
		String tulos = "Henkil�n tiedot: "+nimi + " "+ika;
		tulos+= "\n***************************";
		return tulos;
	}
	
	
	public static void main(String[] args) {
		
		
	}

}
