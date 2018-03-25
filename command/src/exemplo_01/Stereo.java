package exemplo_01;

public class Stereo {

	public void on() {
		System.out.println("Ligando o stereo");
	}
	
	public void off() {
		System.out.println("Desligando o stereo");
	}
	
	public void setCD() {
		System.out.println("Colocando o CD");
	}
	
	public void setDVD() {
		System.out.println("Colocando o DVD");
	}
	
	public void setRadio() {
		System.out.println("Sintonizando o Rádio");
	}
	
	public void setVolume( int volume ) {
		System.out.println("Mexendo no volume: " + volume );
	}
}
