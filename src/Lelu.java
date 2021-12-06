public class LeluTehtava {

	public static void main(String[] args) {
		Lelu lelu = new Lelu("Toyota", 5);
		lelu.tulostaTiedot();
		
		VieteriAuto vieteriAuto = new VieteriAuto("Renault", 10, 100);
		vieteriAuto.tulostaTiedot();
		}		
} //t�h�n p��ttyy

//ja tästä alkaa uusi luokkaosio

class Lelu {
	
	public String nimi; 
	public int paino;

	public Lelu() {
		nimi="";
		paino=0;
	}

	public Lelu(String nimi, int paino) {
		this.nimi = nimi;
		this.paino = paino; 
	}
	
	public void tulostaTiedot() {
		System.out.println("Nimi: " + nimi);
		System.out.println("Paino: " + paino + "kg");
	}
} 

class VieteriAuto extends Lelu {
	public int nopeus;
	public VieteriAuto() {
		paino = 0; 
		nimi = ""; 
		nopeus = 0; 
	}
	
	public VieteriAuto(String nimi, int paino, int nopeus) {
		this.nimi = nimi;
		this.paino = paino;
		this.nopeus = nopeus;
	}
	
	public void kiihdyta(int nopeus) {
		this.nopeus = nopeus;
		nopeus = nopeus++;
	}
	
	@Override //Muista aina t�m� oikeaoppisen koodin vuoksi  
	public void tulostaTiedot()	{    
    super.tulostaTiedot();
		System.out.println("Nopeus: " + nopeus + "km/h");
	}	
}