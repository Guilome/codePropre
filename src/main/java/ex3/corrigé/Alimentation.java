/**
 * 
 */
package ex3.corrig�;

/**
 * @author GOBERT Guillaume
 *
 */
public enum Alimentation {
	
	CARNIVORE("Carnivore"),
	HERBIVORE("Herbivore");

	private String alimentation;

	/** Constructeur
	 * @param categorie
	 */
	private Alimentation(String alimentation){
		this.alimentation = alimentation;
	}
	
	/** 
	 * @return Retourne une categorie
	 */
	public String getAlimentation() {
		return this.alimentation;
	}
}
