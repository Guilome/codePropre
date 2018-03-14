/**
 * 
 */
package ex3.corrigé;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

/**
 * @author GOBERT Guillaume
 *
 */
public class Animal {

	private String nom;
	private Alimentation alimentation;
	private Type type;
	
	/**
	 * Constructeur
	 * @param nom
	 * @param alimentation
	 * @param type
	 */
	public Animal(String nom, Alimentation alimentation, Type type){
		this.nom = nom;
		this.alimentation = alimentation;
		this.type = type;
	}

	public String toString(){
		return this.nom +" => "+ this.alimentation.getAlimentation() +" => "+ this.type.getType();
	}
	
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the alimentation
	 */
	public Alimentation getAlimentation() {
		return alimentation;
	}

	/** Setter
	 * @param alimentation the alimentation to set
	 */
	public void setAlimentation(Alimentation alimentation) {
		this.alimentation = alimentation;
	}

	/** Getter
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/** Setter
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
	
}
