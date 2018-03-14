/**
 * 
 */
package ex3.corrig�;

/**
 * @author GOBERT Guillaume
 *
 */
public enum Type {
	
	MAMMIFERE("Mammif�re"),
	POISSON("Poisson"),
	REPTILE("Reptile");

	private String type;

	/** Constructeur
	 * @param categorie
	 */
	private Type(String type){
		this.type = type;
	}
	
	/** 
	 * @return Retourne une categorie
	 */
	public String getType() {
		return this.type;
	}
}
