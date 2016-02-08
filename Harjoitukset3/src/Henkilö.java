
public class Henkilö {

	// Luokkamuuttujat
	private String nimi;
	private int ika;

	// Konstruktori
	public Henkilö(String uusiNimi){
		nimi = uusiNimi;
		ika = 0;
	}
	public Henkilö(){
		nimi = "Ei annettu";
		ika = 0;
	}
	// getterit ja setterit
	
	public void setIka(int uusiIka){
	ika = uusiIka;	
	}
	
	public String toString(){
		String tulos = "Henkilön tiedot: "+nimi + " "+ika;
		tulos+= "\n***************************";
		return tulos;
	}
	
	
	public static void main(String[] args) {
		
		
	}

}
